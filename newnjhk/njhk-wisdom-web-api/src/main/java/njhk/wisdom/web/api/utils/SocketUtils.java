package njhk.wisdom.web.api.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class SocketUtils {

	public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    public static String BytesHexString(byte[] b) {
        String ret = "";
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            ret += hex.toUpperCase();
        }
        return ret;
    }
	
    /**
     * 16进制转换成为string类型字符串
     * @param s
     * @return
     */
    public static String hexStringToString(String s) {
        if (s == null || s.equals("")) {
            return null;
        }
        s = s.replace(" ", "");
        byte[] baKeyword = new byte[s.length() / 2];
        for (int i = 0; i < baKeyword.length; i++) {
            try {
                baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            s = new String(baKeyword, "UTF-8");
            new String();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return s;
    }


    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        // toUpperCase将字符串中的所有字符转换为大写
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        // toCharArray将此字符串转换为一个新的字符数组。
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static void main(String[] args) {
        byte[]  b =hexStringToBytes("0302000000107824");
        for(byte temp:b){
            System.out.println(temp);
        }

        System.out.println(hexStringToByteStr("00d9"));
    }

    public static String hexStringToByteStr( String input ) {
        int length =input.trim().length();
        String returnStr="" ;
        String[] arr = input.split("");
        for(String s :arr){
            if("0".equals(s)){
                returnStr+="0000";
            }
            if("1".equals(s)){
                returnStr+="0001";
            }
            if("2".equals(s)){
                returnStr+="0010";
            }
            if("3".equals(s)){
                returnStr+="0011";
            }
            if("4".equals(s)){
                returnStr+="0100";
            }
            if("5".equals(s)){
                returnStr+="0101";
            }
            if("6".equals(s)){
                returnStr+="0110";
            }
            if("7".equals(s)){
                returnStr+="0111";
            }
            if("8".equals(s)){
                returnStr+="1000";
            }
            if("9".equals(s)){
                returnStr+="1001";
            }
            if("A".equals(s)){
                returnStr+="1010";
            }
            if("B".equals(s)){
                returnStr+="1011";
            }
            if("C".equals(s)){
                returnStr+="1100";
            }
            if("D".equals(s)){
                returnStr+="1101";
            }
            if("E".equals(s)){
                returnStr+="1110";
            }
            if("F".equals(s)){
                returnStr+="1111";
            }
        }
        return returnStr;
    }

    public static String strReverse(String strReverse) {
        String returnStr = "";
        for (int i = strReverse.length() - 1; i >= 0; i--) {
            char c = strReverse.charAt(i);
            System.out.print(c);
            returnStr+=c;
        }
        return returnStr;
    }
    //字符串转JSON
    public JSONObject parseObject(String text) {
        JSONObject jsonObject = JSON.parseObject(text);
        return jsonObject;
    }
    //JSON转字符串
    public String getString(String text, String key) {
        JSONObject jsonObject = JSON.parseObject(text);
        String value = jsonObject.getString(key);
        return value;
    }
}
