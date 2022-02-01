package com.company;

import java.util.*;

public class CFWorldFootballCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index;
        Map<String, Integer> map = new HashMap<>();
        Map<String, int[]> goals = new HashMap<>();         //Could have used only one HashMap<String,int[]> for all 4 inputs
        for(int i=0;i<n;i++){
            String str=sc.next();
            map.put(str,0);
            goals.put(str,new int[2]);
        }
        sc.nextLine();
        for (int i = 0; i < (n * (n - 1)) / 2; i++) {
            String str = sc.nextLine();
            int s1=str.indexOf('-');
            int s2=str.indexOf(' ');
            int s3=str.indexOf(':');
            String t1=str.substring(0,s1);
            String t2=str.substring(s1+1,s2);
            int g1=Integer.parseInt(str.substring(s2+1,s3));
            int g2=Integer.parseInt(str.substring(s3+1));
            if(g1>g2){
                map.put(t1,map.get(t1)+3);
            }else if(g2>g1){
                map.put(t2,map.get(t2)+3);
            }else{
                map.put(t1,map.get(t1)+1);
                map.put(t2,map.get(t2)+1);
            }
            goals.get(t1)[0]=goals.get(t1)[0]+g1;
            goals.get(t1)[1]=goals.get(t1)[1]+g2;
            goals.get(t2)[0]=goals.get(t2)[0]+g2;
            goals.get(t2)[1]=goals.get(t2)[1]+g1;
        }
        List<Box> boxes = new ArrayList<>();
        List<String> teams = new ArrayList<>();
        for(String ele:map.keySet()){
            boxes.add(new Box(ele,map.get(ele),goals.get(ele)[0],goals.get(ele)[1]));
        }
        boxes.sort(new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                if (o1.value > o2.value) {
                    return 1;
                } else if (o1.value == o2.value) {
                    if(o1.scored-o1.missed>o2.scored-o2.missed){
                        return 1;
                    }else if(o1.scored-o1.missed==o2.scored-o2.missed){
                        if(o1.scored>o2.scored){
                            return 1;
                        }else{
                            return -1;
                        }
                    }else{
                        return -1;
                    }
                } else {
                    return -1;
                }
            }
        });
        for(int i=(n/2);i<n;i++){
            teams.add(boxes.get(i).name);
        }
        Collections.sort(teams);
        for(String ele:teams){
            System.out.println(ele);
        }
    }
}

class Box{
    public String name;
    public int value;
    public int scored;
    public int missed;

    public Box(String name, int value, int scored, int missed) {
        this.name = name;
        this.value = value;
        this.scored = scored;
        this.missed = missed;
    }
}
