/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulator.ibn_api_sim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author frndyan
 */

@RestController
public class TrxController {

    @GetMapping("{cust_id}/{trx_id}")
    public String getTrx(@PathVariable(value = "cust_id") String idpel, @PathVariable(value = "trx_id") String trxid) {
        String output = "";
        try {
            if (idpel.equalsIgnoreCase("533310188648")) {
                output = "{\n" + "	\"data\": {\n" + "		\"trx\": {\n" + "			\"trx_id\": \"" + trxid
                        + "\",\n" + "			\"stan\": \"000000353087\",\n" + "			\"amount\": \"6223\",\n"
                        + "			\"datetime\": \"20200330195158\",\n" + "			\"merchant_code\": \"6021\",\n"
                        + "			\"bank_code\": \"4510017\",\n" + "			\"rc\": \"0000\",\n"
                        + "			\"terminal_id\": \"0000000000000048\",\n"
                        + "			\"material_number\": \"\",\n" + "			\"subscriber_id\": \"533310188648\",\n"
                        + "			\"subscriber_name\": \"MUSHOLA DARUSSALAM       \",\n"
                        + "			\"switcher_refno\": \"042621CA3CEB396062FE750EB4AE51DB\",\n"
                        + "			\"subscriber_segmentation\": \"  S2\",\n" + "			\"power\": \"450\",\n"
                        + "			\"admin_charge\": \"1600\",\n" + "			\"outstanding_bill\": \"1\",\n"
                        + "			\"bill_status\": \"1\",\n" + "			\"blth_summary\": \"JAN18\",\n"
                        + "			\"stand_meter_summary\": \"00012852 - 00012853\",\n"
                        + "			\"payment_status\": \"1\",\n" + "			\"bk\": \"0\",\n"
                        + "			\"rptag\": \"4623\",\n" + "			\"date_settlement\": \"00000000\",\n"
                        + "			\"msg_type\": \"\",\n" + "			\"harga\": \"5023\",\n"
                        + "			\"saldo\": \"96951689075\"\n" + "		}\n" + "	}\n" + "}";
            } else {
                output = "{\n" + "  \"message\": \"ERROR - Invalid IDPEL\",\n" + "  \"status\": 0014,\n" + "}";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output;
    }

}
