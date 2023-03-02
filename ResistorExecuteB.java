import java.io.*;
import java.util.*;
class Array_Resistor
{
float resistance;
Scanner sc=new Scanner(System.in);
void givedata()
{
System.out.println("enter the resistance :");
resistance=sc.nextFloat();
}
void displaydata(Array_Resistor res)
{
System.out.println("the equvalent resistance value is :"+res.resistance);
}
}
class SeriesCircuit extends Array_Resistor
{
Array_Resistor caluculateseriesResistance(Array_Resistor r[])
{
Array_Resistor r3=new Array_Resistor();
System.out.println("In Series Circuit :");
for(int i=0;i<r.length;i++)
{
r3.resistance=r3.resistance+r[i].resistance;
}
return r3;
}
}
class ParallelCircuit extends Array_Resistor
{
Array_Resistor calculateparallelResistance(Array_Resistor r[])
{
Array_Resistor r4=new Array_Resistor();
System.out.println("In Parallel Circuit :");
for(int i=0;i<r.length;i++)
{
r4.resistance+=(1/r[i].resistance);
}
r4.resistance=1/r4.resistance;
return r4;
}
}
class ResistorExecuteB 
{
public static void main(String args[])
{
System.out.println("enter the size of array (i.e no of objects) :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Array_Resistor[] r=new Array_Resistor[n];
for(int i=0;i<n;i++)
{
r[i]=new Array_Resistor();
r[i].givedata();
}
SeriesCircuit p=new SeriesCircuit();
p.displaydata(p.caluculateseriesResistance(r));
ParallelCircuit q=new ParallelCircuit();
q.displaydata(q.calculateparallelResistance(r));
}
}
