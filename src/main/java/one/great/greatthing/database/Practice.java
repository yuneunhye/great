package one.great.greatthing.database;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void main(String[] args) {

        List<Record> records = new ArrayList<>();

        for(var i=0; i<10; i++) {
            Record r = new Record();
            String ip="127.00.00.01";
            String posNo="101";
            r.setPosIp(ip+i);
            r.setPosNo(posNo+i);
            records.add(r);
        }


        System.out.println("################################################");
        System.out.println(records.toString());
        System.out.println("################################################");

        Output out = new Output();
        List<Record> list=new ArrayList();
        for(Record r : records) {
            Record record=new Record();
            record.setPosIp(r.getPosIp());
            record.setPosNo(r.getPosNo());
            list.add(record);

        }

        out.setList(list);

        System.out.println("********************************");
        System.out.println(out.getList());


        System.out.println("################################################");
        System.out.println(records.toString());

    }
}
