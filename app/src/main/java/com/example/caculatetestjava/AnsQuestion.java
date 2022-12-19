package com.example.caculatetestjava;

public class AnsQuestion {
    public String AnsQ[] = {
            "33+12=45",
            "120/4=30",
            "130-34=96",
            "130*2=260",
            "65*3=315",
            "2*8+43-7=52",
            "66/2*77+907=3448",
            "62-1776*7=-12370",
            "5+7-1=11",
            "11-8+99*5=498",
            "60+32=92",
            "785-233=552",
            "3764-850=2914",
            "5610/66=85",
            "43*23=989",
            "21*17=357",
            "357/17=21",
            "13*95=1235",
            "1235/13=95",
            "8883+7774=16657",
            "24-15+123=132",
            "55-66+11=0",
            "432-123=309",
            "789-654=135",
            "13579-2468=11111",
            "66*123=8118",
            "8118/33=246",
            "8118/11=738",
            "8118/22=369",
            "27*107=2889",
            "2889/9/3=107",
            "2889/9=321",
            "2022*12/24=1011",
            "888-123=765",
            "888/444=2",
            "65+76=141",
            "77+49=126",
            "637-427=210",
            "637-427=210",
            "34-23=11",
            "11*44=484",
            "80/20=4",
            "999+456-333=1122",
            "537-35-3+577=1076",
            "22+543=565",
            "565-543=22",
            "11+567=578",
            "975-462=513",
            "654-111=543",
            "9067-2654=6413",
            "55-23=32",
            "499-288=211",
            "754-457=297",
            "98*23=2254",
            "2254/49=46",
            "100-27=73",
            "91/7=13",
            "233+16=249",
            "54+65=119",
            "43-28=15",
            "240*6=1440",
            "154-33=121",
            "1314-487=827",
            "123/41=3",
            "55+231=286",
            "142-35=107",
            "14*25=350",
            "665/7=95",
            "12+3=15",
            "192-93=99",
            "63*7=441",
            "222-124=98",
            "133+376=509",
            "192/6=32",
            "457*4=1828",
            "236/4=59",
            "100-49=51",
            "25*37=925",
            "17*34=578",
            "14*28=392",
            "21/3=7"
    };
    private String mAnsChoices[][] = {
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"},
            {"+","-","*","/"}
    };
    private  String AnsCorrectAns[]={
            "+", "/", "-", "*", "*"
    };

    public String getQuestion(int a){
        String question = AnsQ[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mAnsChoices[a][0];
        return  choice;
    };

    public String getChoice2(int a) {
        String choice = mAnsChoices[a][1];

        return  choice;
    };

    public String getChoice3(int a) {
        String choice = mAnsChoices[a][2];
        return  choice;
    };

    public String getChoice4(int a) {
        String choice = mAnsChoices[a][3];
        return  choice;
    };

    public String getCorrectAnswer(int a) {
        String answer = AnsCorrectAns[a];
        return answer;
    }
}
