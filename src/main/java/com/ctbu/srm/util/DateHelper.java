package com.ctbu.srm.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: Meiziyu
 * @Date: 2019/3/13 11:26
 * @Email 308348194@qq.com
 */
public class DateHelper extends DateUtils {
    private static String[] parsePatterns = new String[]{"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM", "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM", "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM", "yyyyMMddHHmmss", "yyyy-MM-dd-HH:mm:ss"};

    public DateHelper() {
    }

    public static String getDate() {
        return getDate("yyyy-MM-dd");
    }

    public static String getDate(String pattern) {
        return DateFormatUtils.format(new Date(), pattern);
    }

    public static String formatDate(Date date, Object... pattern) {
        String formatDate = null;
        if (pattern != null && pattern.length > 0) {
            formatDate = DateFormatUtils.format(date, pattern[0].toString());
        } else {
            formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
        }

        return formatDate;
    }

    public static String formatDateTime(Date date) {
        return formatDate(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String formatDateTimestring(Date date) {
        return formatDate(date, "yyyyMMddHHmmss");
    }

    public static String getTime() {
        return formatDate(new Date(), "HH:mm:ss");
    }

    public static String getDateTime() {
        return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    public static String getYear() {
        return formatDate(new Date(), "yyyy");
    }

    public static String getMonth() {
        return formatDate(new Date(), "MM");
    }

    public static String getDay() {
        return formatDate(new Date(), "dd");
    }

    public static String getWeek() {
        return formatDate(new Date(), "E");
    }

    public static Date parseDate(Object str) {
        if (str == null) {
            return null;
        } else {
            try {
                return parseDate(str.toString(), parsePatterns);
            } catch (ParseException var2) {
                return null;
            }
        }
    }

    public static long pastDays(Date date) {
        long t = (new Date()).getTime() - date.getTime();
        return t / 86400000L;
    }

    public static long pastHour(Date date) {
        long t = (new Date()).getTime() - date.getTime();
        return t / 3600000L;
    }

    public static long pastMinutes(Date date) {
        long t = (new Date()).getTime() - date.getTime();
        return t / 60000L;
    }

    public static String formatDateTime(long timeMillis) {
        long day = timeMillis / 86400000L;
        long hour = timeMillis / 3600000L - day * 24L;
        long min = timeMillis / 60000L - day * 24L * 60L - hour * 60L;
        long s = timeMillis / 1000L - day * 24L * 60L * 60L - hour * 60L * 60L - min * 60L;
        long sss = timeMillis - day * 24L * 60L * 60L * 1000L - hour * 60L * 60L * 1000L - min * 60L * 1000L - s * 1000L;
        return (day > 0L ? day + "," : "") + hour + ":" + min + ":" + s + "." + sss;
    }

    public static double getDistanceOfTwoDate(Date before, Date after) {
        long beforeTime = before.getTime();
        long afterTime = after.getTime();
        return (double)((afterTime - beforeTime) / 86400000L);
    }

    public static Date currentDateAdd(int days) {
        Calendar canlendar = Calendar.getInstance();
        canlendar.add(5, days);
        return canlendar.getTime();
    }

    public static long getMillis(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.getTimeInMillis();
    }

    public static int diffDateForMin(Date date, Date date1) {
        return (int)((getMillis(date) - getMillis(date1)) / 60000L);
    }

    public static String getDate(Date date, int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, day);
        Date tmp = calendar.getTime();
        String newday = sdf.format(tmp);
        return newday;
    }

    public static Date getDateFromNow(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, day);
        Date tmp = calendar.getTime();
        return tmp;
    }

    public static Map<String, String> getFirstday_Lastday_Month(Date date, int month) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, month);
        Date theDate = calendar.getTime();
        GregorianCalendar gcLast = (GregorianCalendar)Calendar.getInstance();
        gcLast.setTime(theDate);
        gcLast.set(5, 1);
        System.out.println(gcLast.getWeekYear());
        String day_first = df.format(gcLast.getTime());
        StringBuffer str = (new StringBuffer()).append(day_first).append(" 00:00:00");
        day_first = str.toString();
        calendar.add(2, 1);
        calendar.set(5, 1);
        calendar.add(5, -1);
        String day_last = df.format(calendar.getTime());
        StringBuffer endStr = (new StringBuffer()).append(day_last).append(" 23:59:59");
        day_last = endStr.toString();
        Map<String, String> map = new HashMap();
        map.put("first", day_first);
        map.put("last", day_last);
        return map;
    }

    public static Map<String, String> getFirstday_Lastday_Month_Year(Date date, int month, int year) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, month);
        Date theDate = calendar.getTime();
        Calendar c2 = Calendar.getInstance();
        GregorianCalendar gcLast = (GregorianCalendar)Calendar.getInstance();
        gcLast.setTime(theDate);
        gcLast.set(5, 1);
        StringBuffer day_first = (new StringBuffer()).append(c2.get(1) - year).append("-").append(c2.get(2) + 1).append("-").append("01").append(" 00:00:00");
        calendar.add(1, -year);
        calendar.add(2, 1);
        calendar.set(5, 1);
        calendar.add(5, -1);
        String day_last = df.format(calendar.getTime());
        StringBuffer endStr = (new StringBuffer()).append(day_last).append(" 23:59:59");
        day_last = endStr.toString();
        Map<String, String> map = new HashMap();
        map.put("first", day_first.toString());
        map.put("last", day_last);
        return map;
    }

    public static Map<String, String> getMomthDate(Date date, int year) {
        Map<String, String> map = new HashMap();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(1, year);
        Date y = c.getTime();
        String tempM = formatDate(y, "MM");
        String tempD = formatDate(y, "dd");
        String tempY = formatDate(y, "yyyy");
        String beginTime = "";
        String endTime = "";
        System.out.println(formatDate(date, "yyyy-MM-dd HH:mm:ss"));
        if (Integer.valueOf(tempM) == 1) {
            if (Integer.valueOf(tempD) <= 20) {
                beginTime = Integer.valueOf(tempY) - 1 + "-" + 11 + "-21 00:00:00";
                endTime = Integer.valueOf(tempY) - 1 + "-" + 12 + "-20 23:59:59";
            } else {
                beginTime = Integer.valueOf(tempY) - 1 + "-" + 12 + "-21 00:00:00";
                endTime = tempY + "-" + tempM + "-20 23:59:59";
            }
        } else if (Integer.valueOf(tempD) <= 20) {
            beginTime = tempY + "-" + (Integer.valueOf(tempM) - 2) + "-21 00:00:00";
            endTime = tempY + "-" + (Integer.valueOf(tempM) - 1) + "-20 23:59:59";
        } else {
            beginTime = tempY + "-" + (Integer.valueOf(tempM) - 1) + "-21 00:00:00";
            endTime = tempY + "-" + tempM + "-20 23:59:59";
        }

        map.put("first", beginTime);
        map.put("last", endTime);
        return map;
    }

    public static Map<String, String> getLastMomthDate(Date date, int year) {
        Map<String, String> map = new HashMap();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(1, year);
        Date y = c.getTime();
        String tempM = formatDate(y, "MM");
        String tempY = formatDate(y, "yyyy");
        String beginTime = "";
        String endTime = "";
        System.out.println(formatDate(date, "yyyy-MM-dd HH:mm:ss"));
        if (Integer.valueOf(tempM) == 1) {
            beginTime = Integer.valueOf(tempY) - 1 + "-" + 10 + "-21 00:00:00";
            endTime = Integer.valueOf(tempY) - 1 + "-" + 11 + "-20 23:59:59";
        } else {
            beginTime = tempY + "-" + (Integer.valueOf(tempM) - 2) + "-21 00:00:00";
            endTime = tempY + "-" + (Integer.valueOf(tempM) - 1) + "-20 23:59:59";
        }

        map.put("first", beginTime);
        map.put("last", endTime);
        return map;
    }
}
