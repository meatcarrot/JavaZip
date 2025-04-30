class Solution {
    public String solution(String code) {
        
        StringBuilder stringBuilder = new StringBuilder();
        
        // mode는 0, 1이 있음. 1만나면 모드 변경
        // mode 0, 짝수만 추가
        // mode 1, 홀수만 추가
        
        // 배열 변환

        char[] arrCh = code.toCharArray();
        
        int mode = 0;
        for (int i = 0; i < arrCh.length; i++){
            if (arrCh[i]=='1'){
                if(mode==0){
                    mode = 1;
                }
                else {
                    mode = 0;
                }
            }
            if (mode==1){
                if ((arrCh[i] != '1') && (i%2 == 1)){
                    stringBuilder.append(arrCh[i]);
                    System.out.println(mode);
                }
                else{
                    continue;
                }
            }
            if (mode==0){
                if ((arrCh[i] != '1') && (i%2 == 0)){
                    stringBuilder.append(arrCh[i]);
                    System.out.println(mode);
                }
                else{
                    continue;
                }
            }
            
        }
        if (stringBuilder.toString().equals("")){
            return "EMPTY";
        }
        else {
            return stringBuilder.toString();
        }
    }
}