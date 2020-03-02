
package com.test.openmeetings.calendarservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>reminder的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="reminder"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="email"/&gt;
 *     &lt;enumeration value="ical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "reminder")
@XmlEnum
public enum Reminder {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("ical")
    ICAL("ical");
    private final String value;

    Reminder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Reminder fromValue(String v) {
        for (Reminder c: Reminder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
