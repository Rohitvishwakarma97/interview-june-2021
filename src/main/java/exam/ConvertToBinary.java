package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    if(n==0)
    {
        return  0;
    }
          
    String bin="";
    
    While (n>0)
    {
          bin=((n&1)==0?'0':'1')+bin;
          n>>=1;
        
    }
    return "bin";
  }
}
public static void main(String args[])
{
    int n=35 ;
    System.out.println(toBinary(n));
 }
