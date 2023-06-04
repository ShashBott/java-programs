class Trunk_call{
//declare the rate of each call
int ordinary_rate=23;
int urgent_rate=30;
int lighting_rate=35;

public static void  main(String args[]){

ordinary o=new ordinary();
o.charges(3);
urgent u=new urgent();
u.charges(3);
lightning l=new lightning();
l.charges(3);
}
}

class ordinary extends Trunk_call{
//methods
void charges(int hours){
System.out.println(ordinary_rate*hours);
}}


class urgent extends Trunk_call{
void charges(int hours){
System.out.println(urgent_rate*hours);
}}


class lightning extends Trunk_call{
void charges(int hours){
System.out.println(lighting_rate*hours);
}}