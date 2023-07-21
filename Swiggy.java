class Swiggy{
public static double search(String foodName){
if("french fry" == foodName){
System.out.println("Search food name is "+foodName);
return 99;
}
if("fruit bowl" == foodName){
System.out.println("search food name is "+foodName);
return 250;
}
if("paratha" == foodName){
System.out.println("search food name is "+foodName);
return 150;
}
if("chhole bhature" == foodName){
System.out.println("search food name is "+foodName);
return 120.00;
}
if("omelette" == foodName){
System.out.println("search food name is "+foodName);
return 100;}
if("puri sabbji" == foodName){
System.out.println("search food name is "+foodName);
return 100;
}
if("egg bhurji" == foodName){
System.out.println("search food name is "+foodName);
return 250.00;}
if("curd rice" == foodName){
System.out.println("search food name is "+foodName);
return 50;
}
if("chees maggie" ==foodName){
System.out.println("search food name is "+foodName);
return 150;
}
if("pav bhaji" == foodName){
System.out.println("search food name is "+foodName);
return 150;}
if("vada pav" == foodName){
System.out.println("search food name is "+foodName);
return 120;}
if("dhabeli" == foodName){
System.out.println("search food name is "+foodName);
return 70;}
if("egg pav bhaji" == foodName){
System.out.println("search food name is "+foodName);
return 100;}
if("kathi roll" == foodName){
System.out.println("search food name is "+foodName);
return 110;}
if("mango milkshake"== foodName){
System.out.println("search food name is "+foodName);
return 90;}
if("fish tawa fry" == foodName){
System.out.println("search food name is "+foodName);
return 50;}
if("paneer butter masala" == foodName){
System.out.println("search food name is "+foodName);
return 150;}
if("paneer tikka" == foodName){
System.out.println("search food name is "+foodName);
return 250;}
if("chicken tikka" == foodName){
System.out.println("search food name is "+foodName);
return 350;}
if("fish curry" == foodName){
System.out.println("search food name is "+foodName);
return 450;
}
return 0.0;
}

public static double search(String foodName,int quantity){
if("french fry" == foodName){
System.out.println("Search food name is "+foodName);
return 99*quantity;
}
if("fruit bowl" == foodName){
System.out.println("search food name is "+foodName);
return 250*quantity;
}
if("paratha" == foodName){
System.out.println("search food name is "+foodName);
return 150*quantity;
}
if("chhole bhature" == foodName){
System.out.println("search food name is "+foodName);
return 120.00*quantity;
}
if("omelette" == foodName){
System.out.println("search food name is "+foodName);
return 100*quantity;}
if("puri sabbji" == foodName){
System.out.println("search food name is "+foodName);
return 100*quantity;
}
if("egg bhurji" == foodName){
System.out.println("search food name is "+foodName);
return 250.00*quantity;}
if("curd rice" == foodName){
System.out.println("search food name is "+foodName);
return 50*quantity;
}
if("chees maggie" ==foodName){
System.out.println("search food name is "+foodName);
return 150*quantity;
}
if("pav bhaji" == foodName){
System.out.println("search food name is "+foodName);
return 150*quantity;}
if("vada pav" == foodName){
System.out.println("search food name is "+foodName);
return 120*quantity;}
if("dhabeli" == foodName){
System.out.println("search food name is "+foodName);
return 70*quantity;}
if("egg pav bhaji" == foodName){
System.out.println("search food name is "+foodName);
return 100*quantity;}
if("kathi roll" == foodName){
System.out.println("search food name is "+foodName);
return 110*quantity;}
if("mango milkshake"== foodName){
System.out.println("search food name is "+foodName);
return 90*quantity;}
if("fish tawa fry" == foodName){
System.out.println("search food name is "+foodName);
return 50*quantity;}
if("paneer butter masala" == foodName){
System.out.println("search food name is "+foodName);
return 150*quantity;}
if("paneer tikka" == foodName){
System.out.println("search food name is "+foodName);
return 250*quantity;}
if("chicken tikka" == foodName){
System.out.println("search food name is "+foodName);
return 350*quantity;}
if("fish curry" == foodName){
System.out.println("search food name is "+foodName);
return 450*quantity;
}
return 0.0;
}
}