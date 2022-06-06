package main.java.ua.lviv.iot;

import java.util.ArrayList;
import java.util.Collections;

public class Sortuvannia {
    ArrayList<TwoHandedSaw> list = new ArrayList<TwoHandedSaw>();
    ArrayList<TwoHandedSaw> list1 = new ArrayList<TwoHandedSaw>();
    public void AddElements(TwoHandedSaw object){

        list1.add(object);
    }

    public void vuvid() {
        for (int i = 0; i < list.size(); i++) {
            int b= i+1;
            System.out.println(b+". "+list.get(i));
        }
        System.out.println();
    }
    public void SortUpByMass() {

        Collections.sort(list);
        System.out.println("\n"+"Top Mass:");
        vuvid();
    }
    public void SortDownByMass(){

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Less Mass:");
        vuvid();
    }
    public void SortUpByMaterials() {

        Collections.sort(list, Collections.reverseOrder(new ByMaterials()));
        System.out.println("Top Materials:");
        vuvid();
    }
    public void SortDownByMaterials(){

        Collections.sort(list,new ByMaterials());
        System.out.println("Less Materials:");
        vuvid();
    }
    public void BestMass(int MaxMass){
        int CurentMax=0;
        int Position=0;
        for (int i=0;i< list1.size();i++){
            if (MaxMass > list1.get(i).getMass() && CurentMax < list1.get(i).getMass()){
                CurentMax=list1.get(i).getMass();
                Position=i;
            }
        }
        System.out.println("Best Tools by "+MaxMass+" kg is "+list1.get(Position));

    }
    public void BestDensity(int MaxDensity){
        int CurentMax = 0;
        int Position=0;
        for (int i=0;i< list1.size();i++){
            if (MaxDensity > list1.get(i).GetMaterial().GetDensity() && CurentMax < list1.get(i).GetMaterial().GetDensity()){
                CurentMax=list1.get(i).GetMaterial().GetDensity();
                Position=i;
            }
        }
        System.out.println("Best Tools by"+ MaxDensity+" kg/m^3 is "+list1.get(Position)+"made from "+list1.get(Position).GetMaterial());

    }
    public void MassLessThen(int MaxMass){
        for (int i=0;i< list1.size();i++){
            if (MaxMass > list1.get(i).getMass() ){
                list.add(list1.get(i));
            }
        }
        System.out.println("\n"+"Tools with mass less then "+MaxMass+" kg:");
        vuvid();
        Sort();
    }
    public void DensityLessThen(int MaxDensity){
        list.clear();
        for (int i=0;i< list1.size();i++){
            if (MaxDensity > list1.get(i).GetMaterial().GetDensity() ){
                list.add(list1.get(i));
            }
        }
        System.out.println("\n"+"Tools with density less then "+MaxDensity+" kg/m^3:");
        vuvid();
        Sort();
    }
    public void Sort(){
        SortUpByMass();
        SortDownByMass();
        SortUpByMaterials();
        SortDownByMaterials();
    }
}
