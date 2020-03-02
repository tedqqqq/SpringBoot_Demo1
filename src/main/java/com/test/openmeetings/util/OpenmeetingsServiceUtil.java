package com.test.openmeetings.util;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.test.meetings.userwebService.ExternalUserDTO;
import com.test.meetings.userwebService.OrgApacheOpenmeetingsWebserviceUserWebService;
import com.test.meetings.userwebService.RoomOptionsDTO;
import com.test.meetings.userwebService.ServiceResult;
import com.test.meetings.userwebService.UserWebService;
import com.test.openmeetings.roomservice.OrgApacheOpenmeetingsWebserviceRoomWebService;
import com.test.openmeetings.roomservice.RoomDTO;
import com.test.openmeetings.roomservice.RoomWebService;
import com.test.openmeetings.roomservice.Type;
import com.test.openmeetings.roomservice.Type2;



/**
 * openmeetings的专用工具类
 * 
 * @author psc
 *
 */
public class OpenmeetingsServiceUtil {

    /**
     * 线程安全的map对象。存放sid
     */
    private static ConcurrentHashMap<String, String> sidMap = new ConcurrentHashMap<String, String>();

    private static OrgApacheOpenmeetingsWebserviceRoomWebService orgRoom = new OrgApacheOpenmeetingsWebserviceRoomWebService();
    private static OrgApacheOpenmeetingsWebserviceUserWebService orgUser = new OrgApacheOpenmeetingsWebserviceUserWebService();
    private static RoomWebService roomService;
    private static UserWebService userWebService;

    /**
     * 得到RoomWebService 基于双检锁的单例模式
     * 
     * @return
     */
    private static RoomWebService getRoomWebService() {
        if (roomService == null) {
            synchronized (RoomWebService.class) {
                if (roomService == null) {
                    try {
                        roomService = orgRoom.getRoomWebServicePort();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }
        }
        return roomService;
    }


    /**
     * 得到RoomWebService 基于双检锁的单例模式
     * 
     * @return
     */
    private static UserWebService getUserWebService() {
        if (userWebService == null) {
            synchronized (UserWebService.class) {
                if (userWebService == null) {
                    try {
                        userWebService = orgUser.getUserService();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }
        }
        return userWebService;
    }

    /**
     * 得到某个登录用户的sid
     */
    public static String getSid() {

        if (!sidMap.isEmpty()) {
            String time = sidMap.get("time");
            // 假如没超过10分钟
            if (Long.valueOf(time) + 1000 * 60 * 10 <= System.currentTimeMillis()) {
                return sidMap.get("sid");
            }
        }
        userWebService = getUserWebService();
        if (userWebService == null) {
            return null;
        }
        try {
            ServiceResult rs = userWebService.login("test","Aa1111!");
            String sid = rs.getMessage();
            sidMap.put("sid", sid);
            sidMap.put("time", String.valueOf(System.currentTimeMillis()));
            return sid;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    public static Long addRoom(String roomType, Long capacity, boolean allowRecording, boolean allowUserQuestions) {
        RoomDTO room = new RoomDTO();
        room.setType(Type2.fromValue(roomType));
        room.setCapacity(capacity);
        room.setAllowRecording(allowRecording);
        room.setAllowUserQuestions(allowUserQuestions);
        RoomWebService roomService = getRoomWebService();
        // 如果roomService没拿到，说明openmeetings的服务没起，进不去，返回-1表示异常
        if (roomService == null) {
            return -1L;
        }
        String sid = getSid();
        if(sid == null ) {
            return -1L;
        }
        room = roomService.add(sid, room);
        return room.getId();
    }

    public static String getIntoRoom(Long roomId,boolean showAudioVideoTest,boolean moderator,boolean allowSameURLMultipleTimes,boolean allowRecording,ExternalUserDTO user) {
        RoomOptionsDTO options = new RoomOptionsDTO();
        options.setRoomId(roomId);
        options.setShowAudioVideoTest(showAudioVideoTest);
        options.setModerator(moderator);
        options.setAllowSameURLMultipleTimes(allowSameURLMultipleTimes);
        options.setAllowRecording(allowRecording);
        UserWebService userWebService = getUserWebService();
        if(userWebService == null) {
            return null;
        }
        String sid = getSid();
        if(sid == null ) {
            return null;
        }
        ServiceResult serviceRs = userWebService.getRoomHash(sid, user, options);
        return serviceRs.getMessage();
    }

//  public static void getRoomFile() {
//      FileWebService fileWebService = getFileWebService();
//      FileExplorerObject ex = fileWebService.getRoom(getSid(), 6);
//      List<FileItemDTO> files = ex.getRoomHome();
//      for(FileItemDTO dto : files) {
////            dto.getha
//      }
//  }
}

