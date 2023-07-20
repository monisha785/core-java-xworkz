class Restaurant
{
static String menu[]={"prawns gheeroast","prawns chilli","prawns manchurian","prawns biryani","fish fry","fish kabab","fish curry","fish manchurian","tawa fry","mutton curry","mutton biryani","mutton fry","chicken kabab","chicken lollipop","tandoori","grill chicken","chicken manchurian","naan","chicken biryani","chicken butter masala","butter masala","noodels","fried rice","roti curry","butter kulcha","roti dal","veg biryani","pulav","gobi manchurian","idli","idli vada","dosa","masal dosa","butter dosa","chicken fried rice","chicken noodels","palak paneer","soup","paneer rice","babycorn manchurian","babycorn chilli","mushroom manchurian","mushroom chilli","curd rice","rice dal","kesari bath","mixed noodles","gobi noodles","babycorn noodles","chicken hriyali"};

	
public static void main(String resturant[])
{

System.out.println("Main Started");
System.out.println("the list are "+menu[0]+","+menu[1]+","+menu[2]+","+menu[3]+","+menu[4]+","+menu[5]+","+menu[6]+","+menu[7]+","+menu[8]+","+menu[9]+","+menu[10]+","+menu[11]+","+menu[12]+","+menu[13]+","+menu[14]+","+menu[15]+","+menu[16]+","+menu[17]+","+menu[18]+","+menu[19]+","+menu[20]+","+menu[21]+","+menu[22]+","+menu[23]+","+menu[24]+","+menu[25]+","+menu[26]+","+menu[27]+","+menu[28]+","+menu[29]+","+menu[30]+","+menu[31]+","+menu[32] +menu[33]+","+menu[34]+","+menu[35]+","+menu[36]+","+menu[37]+","+menu[38]+","+menu[39]+","+menu[40]+","+menu[41]+","+menu[42]+","+menu[43]+","+menu[44]+","+menu[45]+","+menu[46]+","+menu[47]+","+menu[48]+","+menu[49]);
for(String menu : menu){
	System.out.println(menu);
}
System.out.println("Main Ended");
}
}