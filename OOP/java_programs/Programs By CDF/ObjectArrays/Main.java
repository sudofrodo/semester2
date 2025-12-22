public class Main{
    public static void main(String[] args) {
        Well w1 = new Well("kinal", true, true);
        Well w2 = new Well("nihar" , false, false);
        Well w3 = new Well("dirya" , true, false);
        Well w4 = new Well("tilab", false, true);

        Well[] wellArray = {w1,w2,w3,w4};
        // for(int i = 0 ; i < 3 ; i++){
            // wellArray[i] = "w" + i; //this will create an error that string won't be converted to null
        // }
        for(int j = 0 ; j < 4 ; j++){
            wellArray[j].printName();
        }
        
        Well[] wellCopyArray = wellArray.clone();
        System.out.println(wellArray == wellCopyArray); //returns false , as both arrays hold different addresses but objects are still same;
        // wellCopyArray[0].setWater(false);
        // System.out.println(wellArray[0].getWater() +" " +  wellCopyArray[0].getWater());
        Well[] secondWellArray = new Well[wellArray.length];
        System.arraycopy(wellArray, 0, secondWellArray, 0, 4);
        System.out.println(wellArray == secondWellArray); //shallow copy
        secondWellArray[0].setWater(false);  
        System.out.println(wellArray[0].getWater() +" " +  secondWellArray[0].getWater());
        //only way to make deep copy is to manauly create new objects in loop
        

    }
}