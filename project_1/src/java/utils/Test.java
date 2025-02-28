
package utils;

public class Test {
    public static void main(String[] args) {
        String fileName = ".png";
        System.out.println(fileName.lastIndexOf(".jpg"));
        System.out.println(fileName.lastIndexOf(".jpeg"));

        System.out.println(fileName.lastIndexOf(".png"));
        if(fileName.lastIndexOf(".jpg")>0||fileName.lastIndexOf(".jpeg")>0||fileName.lastIndexOf(".png")>0){
            System.out.println("1");
        }
    }
}
