import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //좌표값 넣기기
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[1] == e2[1]) { //두 번째 원소가 같다면 첫 번째 원소끼리 비교
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });
//        위 표현은 아래와 같은 의미
//        if(e1[0] < e2[0]) return -1;
//        else if(e1[0] == e2[0]) return 0;
//        else return 1;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}