package com.test.springboot.controller;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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




@RestController
@RequestMapping(value="/op")
//@Api(value="测试对接openmeetings",tags="op")
public class SysmenuController {

    private static RoomWebService roomService;
    private static UserWebService userService;
    private static Map<Long, Integer> roomCountersMap = new LinkedHashMap<>();

    static {
        OrgApacheOpenmeetingsWebserviceRoomWebService orgRoom = new OrgApacheOpenmeetingsWebserviceRoomWebService();
        OrgApacheOpenmeetingsWebserviceUserWebService orgUser = new OrgApacheOpenmeetingsWebserviceUserWebService();
        userService = orgUser.getUserService();
        roomService = orgRoom.getRoomWebServicePort();
    }

   // @ApiOperation(value="老师加入公共房间")  
    @RequestMapping(value="/addToRoom",method=RequestMethod.POST)
    public ServiceResult createRoom(String id,String fname,String lname,Long roomId) throws RemoteException{

        String sid = getSid("duyu","Dy@@2017");
        //创建外部人员访问信息
        ExternalUserDTO user = new ExternalUserDTO();
        user.setEmail("zda@dwa.com");
        user.setExternalId(id);
        user.setExternalType("Teacher");
        user.setFirstname(fname);
        user.setLastname(lname);
        user.setLogin("T"+id);

        RoomOptionsDTO options = new RoomOptionsDTO();
        options.setRoomId(roomId);
        options.setShowAudioVideoTest(true);
        options.setModerator(true);


        ServiceResult serviceRs = userService.getRoomHash(sid, user, options);
        System.out.println(serviceRs.getMessage());

        roomCountersMap.putIfAbsent(roomId, 1);

        return serviceRs;
    }

//  //  @ApiOperation(value="给学生随机分配面试房间")  
//    @RequestMapping(value="/randomToRoom",method=RequestMethod.POST)
//    public ServiceResult randomToRoom(String id,String fname,String lname) throws RemoteException{
//
//        ServiceResult serviceRs;
//
//        //用户登录，获取sid
//        String sid = getSid("root","Avie@2017");
//
//        //创建外部人员访问信息
//        ExternalUserDTO user = new ExternalUserDTO();
//        user.setEmail("zda@dwa.com");
//        user.setExternalId(id);
//        user.setExternalType("student");
//        user.setFirstname(fname);
//        user.setLastname(lname);
//        user.setLogin("S"+id);
//
//        //取得所有开启的房间号，然后查询每个房间号的人数,如果有房间人数为1的房间，则视为空闲房间，可以进入面试
//        List<Long> list = new ArrayList<Long>();
//        Set<Long> set = roomCountersMap.keySet();
//        list.addAll(set);
//        OrgApacheOpenmeetingsWebserviceRoomWebService orgRoom = new OrgApacheOpenmeetingsWebserviceRoomWebService();
//        RoomWebService roomService = orgRoom.getRoomWebServicePort();
////        List<RoomCountDTO> rooms = roomService.counters(sid, list);
////
////        Long roomId = (long)0;
////        for(RoomCountDTO room : rooms) {
////            if(room.getRoomCount() == 1) {
////                roomId = room.getRoomId();
////            }
////        }
//        List<RoomCountDTO> rooms = roomService.get(sid, list);
//
//        Long roomId = (long)0;
//        for(RoomCountDTO room : rooms) {
//            if(room.getRoomCount() == 1) {
//                roomId = room.getRoomId();
//            }
//        }
//        if(roomId == 0) {
//            serviceRs = new ServiceResult();
//            serviceRs.setMessage("对不起当前没有空闲房间，请等待！");
//            serviceRs.setType("noRoom");
//            return serviceRs;
//        }
//
//        RoomOptionsDTO options = new RoomOptionsDTO();
//        options.setRoomId(roomId);
//        options.setShowAudioVideoTest(true);
//        options.setModerator(false);
//
//        serviceRs = userService.getRoomHash(sid, user, options);
//        System.out.println(serviceRs.getMessage());
//
//        return serviceRs;
//    }

 //   @ApiOperation(value="老师创建自定义房间")  
    @RequestMapping(value="/customizeRoom",method=RequestMethod.POST)
    public ServiceResult customizeRoom(String id,String fname,String lname,String ty,long num) throws RemoteException{

        //得到service
        String sid = getSid("duyu","Dy@@2017");

        RoomDTO room = new RoomDTO();
        room.setType(Type2.fromValue(ty));
        room.setCapacity(num);
        room.setAllowRecording(true);
        room = roomService.add(sid, room);

        //创建外部人员访问信息
        ExternalUserDTO user = new ExternalUserDTO();
        user.setEmail("zda@dwa.com");
        user.setExternalId(id);
        user.setExternalType("Teacher");
        user.setFirstname(fname);
        user.setLastname(lname);
        user.setLogin("T"+id);

        RoomOptionsDTO options = new RoomOptionsDTO();
        options.setRoomId(room.getId());
        options.setShowAudioVideoTest(true);
        options.setModerator(true);


        ServiceResult serviceRs = userService.getRoomHash(sid, user, options);
        System.out.println(serviceRs.getMessage());

        roomCountersMap.putIfAbsent(room.getId(), 1);

        return serviceRs;
    }


    /**
     * 得到某个登录用户的sid
     */
    private String getSid(String name,String pwd) {     
        ServiceResult rs = userService.login(name, pwd);    
        return rs.getMessage();
    }
}

