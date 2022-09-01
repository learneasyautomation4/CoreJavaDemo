public class SubstringSplitWithSpace {

    public static void main(String[] args) {
        String originalStr="Showing       1 to 10 of 1082";
        int indexPosition=1;
//        String[] splittedStrArray=str.split("\\s+");
////        System.out.println("Fist string: " + splittedStrArray[0]);
////        System.out.println("second string: " + splittedStrArray[1]);
////        System.out.println("third string: " + splittedStrArray[2]);
////        System.out.println("fourth string: " + splittedStrArray[3]);
////        System.out.println("fifth string: " + splittedStrArray[4]);
////        System.out.println("sixth string: " + splittedStrArray[5]);
//
//        for(int i=0;i<splittedStrArray.length;i++){
//            System.out.println( i +"th String: " + splittedStrArray[i]);
//        }
        SubstringSplitWithSpace obj=new SubstringSplitWithSpace();
        String getNewSpiltedString=obj.getSubString(originalStr,indexPosition);
        System.out.println("New Splitted string at " + indexPosition+" is: " + getNewSpiltedString);
    }

    public String getSubString(String str,int indexPosition){
        String[] splittedStrArray=str.split("\\s+");
        String splittedStr= splittedStrArray[indexPosition];
        return splittedStr;
    }
}