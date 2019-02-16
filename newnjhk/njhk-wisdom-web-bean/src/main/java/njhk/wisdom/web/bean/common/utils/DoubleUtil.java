package njhk.wisdom.web.bean.common.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class DoubleUtil
{
//  private static final int DEF_DIV_SCALE = 4;

  public static Double add(Double v1, Double v2)
  {
	if(v1==null){
		v1=new Double("0.00");
	}
	if(v2==null){
		v2=new Double("0.00");
	}
    BigDecimal b1 = new BigDecimal(v1.toString());
    BigDecimal b2 = new BigDecimal(v2.toString());
    return Double.valueOf(b1.add(b2).doubleValue());
  }

  public static Double add(BigDecimal b1, BigDecimal b2)
  {
    return Double.valueOf(b1.add(b2).doubleValue());
  }
  
  
  public static Double sub(Double v1, Double v2)
  {
    if(v1==null){
		v1=new Double("0.00");
	}
	if(v2==null){
		v2=new Double("0.00");
	}
    BigDecimal b1 = new BigDecimal(v1.toString());
    BigDecimal b2 = new BigDecimal(v2.toString());
    return Double.valueOf(b1.subtract(b2).doubleValue());
  }
  
  
  public static Double sub(BigDecimal b1 , BigDecimal b2)
  {
    return Double.valueOf(b1.subtract(b2).doubleValue());
  }

  public static Double mul(Double v1, Double v2)
  {
    BigDecimal b1 = new BigDecimal(v1.toString());
    BigDecimal b2 = new BigDecimal(v2.toString());
    return Double.valueOf(b1.multiply(b2).doubleValue());
  }

  public static Double div(Double v1, Double v2)
  {
    BigDecimal b1 = new BigDecimal(v1.toString());
    BigDecimal b2 = new BigDecimal(v2.toString());
    return Double.valueOf(b1.divide(b2, 4, 4).doubleValue());
  }

  public static String divByStrPercent(String v1, String v2)
  {
    String rtnStr = "0.00";
    if ((v1 != null) && (!"".equals(v1)) && (v2 != null) && (!"".equals(v2)) && (!"0".equals(v1)) && (!"0".equals(v2))) {
      BigDecimal b1 = new BigDecimal(v1);
      BigDecimal b2 = new BigDecimal(v2);
      Double rtn = Double.valueOf(b1.divide(b2, 4, 4).doubleValue());
      BigDecimal b4 = new BigDecimal(rtn.toString());
      BigDecimal b3 = new BigDecimal("100");
      rtn = Double.valueOf(b4.multiply(b3).doubleValue());
      rtnStr = rtn.toString();
    }
    return rtnStr;
  }

  public static Double addByStr(String v1, String v2)
  {
    if ((v1 == null) || ("".equals(v1))) {
      v1 = "0.00";
    }
    if ((v2 == null) && ("".equals(v2))) {
      v2 = "0.00";
    }
    BigDecimal b1 = new BigDecimal(v1);
    BigDecimal b2 = new BigDecimal(v2);
    return Double.valueOf(b1.add(b2).doubleValue());
  }

  public static String divByStr(String v1, String v2)
  {
    String rtnStr = "0.00";
    if ((v1 != null) && (!"".equals(v1)) && (v2 != null) && (!"".equals(v2)) && (!"0".equals(v1)) && (!"0".equals(v2))) {
      BigDecimal b1 = new BigDecimal(v1);
      BigDecimal b2 = new BigDecimal(v2);
      Double rtn = Double.valueOf(b1.divide(b2, 2, 4).doubleValue());
      rtnStr = rtn.toString();
    }
    return rtnStr;
  }

  public static Double div(Double v1, Double v2, int scale)
  {
    if (scale < 0) {
      throw new IllegalArgumentException(
        "The scale must be a positive integer or zero");
    }
    BigDecimal b1 = new BigDecimal(v1.toString());
    BigDecimal b2 = new BigDecimal(v2.toString());
    return Double.valueOf(b1.divide(b2, scale, 4).doubleValue());
  }

  public static String compare(Double a, Double b)
  {
	if (a == null) {
		a=new Double("0.00"); 
    }
    if (b == null) {
    	b=new Double("0.00"); 
    }  
	BigDecimal val1 = new BigDecimal(a);
    BigDecimal val2 = new BigDecimal(b);
    String result = "";
    if (val1.compareTo(val2) < 0) {
      result = "1";
    }
    if (val1.compareTo(val2) == 0) {
      result = "0";
    }
    if (val1.compareTo(val2) > 0) {
      result = "-1";
    }
    return result;
  }
  
  public static String DoubleVlu(Double a)
  {
	  DecimalFormat    df   = new DecimalFormat("######0.00");   
	  return df.format(a); 
	  
//	  BigDecimal b = new BigDecimal(a);
//	  return b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	  
	  
  }
  
  
  public static void main(String[] args)throws ParseException
	{
//	  Double b =new Double("0.1");
//	  System.out.println(DoubleVlu(b));
//	   double d = 0.1;
//	   BigDecimal b = new BigDecimal(d);
//	   d = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();        
//	   System.out.println(DoubleUtil.DoubleVlu(DoubleUtil.mul(new Double("0.01"), new Double("100"))));
//	  
//	   DecimalFormat df = new DecimalFormat("######0.00");
//	   System.out.println(df.format(new Double("1")));
//	   
//	   System.out.println(DoubleUtil.div(new Double("1"), new Double("100")));
	   
	   System.out.println(DoubleUtil.compare(new Double("1"), new Double("100")));
	  
	}
  
  
  
}
