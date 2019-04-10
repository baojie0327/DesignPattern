package com.example.ahuang.designpattern.flyweight;

/*
 * TrainTicket  2019-04-10
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 10
 */
public class TrainTicket extends Ticket{


    public TrainTicket(String from, String to) {
        super(from, to);
    }

    @Override
    public void showTicketInfo(String seat) {
        if (from.equals("北京") && to.equals("青岛")){
            switch (seat){
                case "business":
                    System.out.println(from+"到"+to+getName()+"列车：商务座的价格是988元！");
                    break;
                case "one":
                    System.out.println(from+"到"+to+getName()+"列车：一等座的价格是689元！");
                    break;
                case "two":
                    System.out.println(from+"到"+to+getName()+"列车：二等座的价格是298元！");
                    break;
            }
        }else if (from.equals("北京") && to.equals("济南")){
            switch (seat){
                case "business":
                    System.out.println(from+"到"+to+getName()+"列车：商务座的价格是598元！");
                    break;
                case "one":
                    System.out.println(from+"到"+to+getName()+"列车：一等座的价格是389元！");
                    break;
                case "two":
                    System.out.println(from+"到"+to+getName()+"列车：二等座的价格是186元！");
                    break;
            }
        }

    }
}