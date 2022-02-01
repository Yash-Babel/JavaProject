package com.company;


import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class CFBerlandMusic {
    public static void main(String[] args)
            throws IOException {

        Reader sc = new Reader();
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<int[]> arr = new ArrayList<>();
            int n= sc.nextInt();
            int forZeroes=0;
            for(int i=0;i<n;i++){
                int[] art=new int[4];
                art[0]=i+1;
                art[1]=sc.nextInt();
                arr.add(art);
            }
            String str=sc.readLine();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='0'){
                    arr.get(i)[2]=0;
                    forZeroes++;
                }else{
                    arr.get(i)[2]=1;
                }
            }
            arr.sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[1]>o2[1]){
                        return 1;
                    }
                    return -1;
                }
            });
            int counter = 0;
            int counter2 = 0;
            for(int i=0;i<n;i++){
                if(arr.get(i)[2]==1){
                    counter++;
                    arr.get(i)[3]=forZeroes + counter;
                }else{
                    counter2++;
                    arr.get(i)[3]=counter2;
                }
            }
            arr.sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[0]>o2[0]){
                        return 1;
                    }
                    return -1;
                }
            });
            for(int i=0;i<n;i++){
                System.out.printf("%d ",arr.get(i)[3]);
            }
            System.out.println();
        }
    }
}
class Reader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public Reader(String file_name) throws IOException
    {
        din = new DataInputStream(
                new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException
    {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') {
                if (cnt != 0) {
                    break;
                }
                else {
                    continue;
                }
            }
            buf[cnt++] = (byte)c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }

    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (c == '.') {
            while ((c = read()) >= '0' && c <= '9') {
                ret += (c - '0') / (div *= 10);
            }
        }

        if (neg)
            return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0,
                BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
}
