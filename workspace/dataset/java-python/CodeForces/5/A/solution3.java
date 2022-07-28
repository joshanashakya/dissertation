import java.io.*;import java.util.ArrayList;import java.util.List; public class MAIN{     private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));     public static void main(String[] args) throws Exception{         List<String> commands = new ArrayList<>(0);         while (true){            String s = reader.readLine();            if(s != null && !s.isEmpty()){                commands.add(s);            } else {                break;            }        }         int trafficCount = 0;        int currentPeopleCount = 0;         for(int i=0;i<commands.size();++i){            if(commands.get(i).startsWith("+")){                ++currentPeopleCount;            } else if(commands.get(i).startsWith("-")){                --currentPeopleCount;            } else {                String[] parts = commands.get(i).split(":");                int msgLen = parts != null && parts.length > 1 ? parts[1].length() : 0;                trafficCount += currentPeopleCount*msgLen;            }        }         System.out.println(trafficCount);     } }