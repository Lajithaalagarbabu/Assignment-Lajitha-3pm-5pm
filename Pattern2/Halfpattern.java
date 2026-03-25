import java.util.*;
public class HalfPattern{
public static void main(String []args){
int n=4;
for(int i=1;i<=n;i++){
for(int j=1;j<=i-1;j++){
System.out.print(" ");
}
int width=2*(n-i)+1;
for(int j=1;j<=width;j++){
if(i==1 || j==1 || j== width){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}