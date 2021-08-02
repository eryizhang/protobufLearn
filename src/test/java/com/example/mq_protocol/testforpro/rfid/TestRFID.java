package com.example.mq_protocol.testforpro.rfid;

public class TestRFID {

    public static void main(String[] args) {
        String l="1231";
        String RFID_FORMAT = "%02x-";
        byte[] bs=l.getBytes();
        System.out.println(parseBytesToRfid(bs,RFID_FORMAT));

        String rfid="31-34-35-36";
        System.out.println(new String(parseRfidToBytes(rfid)));
    }

    public static String parseBytesToRfid(byte[] bytes, String format) {
        StringBuilder rfid = new StringBuilder();
        if (true) {
            for (byte item : bytes) {
                String hexStr = String.format(format, item & 0xff);
                rfid.append(hexStr);
            }
        }

        if (true) {
            rfid.deleteCharAt(rfid.length() - 1);
        }
        return rfid.toString();
    }

    public static byte[] parseRfidToBytes(String rfid) {
        String[] cardSplit = rfid.split("-");
        if (cardSplit.length != 4) {
            return new byte[0];
        }
        byte[] bytes = new byte[4];
        for (int i = 0; i < cardSplit.length; i++) {
            bytes[i] = (byte)Integer.parseInt(cardSplit[i], 16);
        }

        return bytes;
    }
}
