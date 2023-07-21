class Subtraction{
public static void main (String Subtraction[]){
 sub(56,78);
 sub(112,456);
 sub(89,67);
 sub(678,890);
 sub(780,234);
 sub(690,900);
 sub(800,980);
 sub(1000,90);
 sub(908,809);
 sub(756,863);
 //method overloading
 
 sub(856,978,34);
 sub(12,56,67);
 sub(899,7,78);
 sub(78,80,90);
 sub(70,34,800);
 sub(675,90,89);
 sub(80,80,901);
 sub(145,76,78);
 sub(98,89,863);
 sub(77,83,72);
 }
 public static void sub(int x , int y ){
 System.out.println(x-y);
 
  }
  public static void sub(int x , int y , int z) {     
 System.out.println(x-y-z);
 }


}