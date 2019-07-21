package designpattern.structural.composite;

public class Application {

    public static void main(String[] args) {

        Folder dirD = new Folder("D:");

        File fileOne = new JpegFile("my_job.jpeg", 11.3);
        File fileTwo = new JpegFile( "birthday_party.jpeg", 9.2);
        File fileThree = new DocFile( "Php_beginner_manual.doc", 59.4);

        dirD.addFile(fileOne);
        dirD.addFile(fileTwo);
        dirD.addFile(fileThree);


        Folder dirPic = new Folder("Pictures");

        File fileFour = new JpegFile("airplane.jpeg", 7.5);
        File fileFive = new DocFile("winnie_the_pooh.doc", 19.5 );

        dirPic.addFile(fileFour);
        dirPic.addFile(fileFive);

        dirD.addFile(dirPic);


        Folder dirDocs = new Folder("Documents");

        File fileSix = new DocFile("gone_with_the_wind.doc", 27.5);
        File fileSeven = new JpegFile("family.jpeg",7.8);

        dirDocs.addFile(fileSix);
        dirDocs.addFile(fileSeven);

        dirD.addFile(dirDocs);

        dirD.showInfo();
    }

}