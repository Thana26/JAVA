import java.io.*;
import java.util.*;
class Resistor
{
float resistance;
Scanner sc=new Scanner(System.in);
void givedata()
{
System.out.println("enter the resistance :");
resistance=sc.nextFloat();
}
void displaydata(Resistor res)
{
System.out.println("the equvalent resistance value is :"+res.resistance);
}
}
class SeriesCircuit extends Resistor
{
Resistor caluculateseriesResistance(Resistor r1,Resistor r2)
{
Resistor r3=new Resistor();
System.out.println("In Series Circuit :");
r3.resistance=r1.resistance+r2.resistance;
return r3;
}
}
class ParallelCircuit extends Resistor
{
Resistor calculateparallelResistance(Resistor r1,Resistor r2)
{
Resistor r4=new Resistor();
System.out.println("In Parallel Circuit :");
r4.resistance=(r1.resistance*r2.resistance)/(r1.resistance+r2.resistance);
return r4;
}
}
class ResisterExecute  
{
public static void main(String args[])
{
Resistor r1=new Resistor();
Resistor r2=new Resistor();
r1.givedata();
r2.givedata();
SeriesCircuit p=new SeriesCircuit();
p.displaydata(p.caluculateseriesResistance(r1,r2));
ParallelCircuit q=new ParallelCircuit();
q.displaydata(q.calculateparallelResistance(r1,r2));
}
}
