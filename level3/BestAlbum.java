package level3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2022-03-24
 * 알고리즘 : 해시
 * 프로그래머서 level3 : 베스트 앨범
 */

public class BestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "pop", "classic", "classic"};
        int[] plays = {400, 600, 150, 2500, 500, 500};

        BestAlbum st = new BestAlbum();
        int[] result = st.solution(genres, plays);
        for(Integer i : result){
            System.out.println(i);
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<>();

        // 장르별 총 재생횟수 구하기(key : 장르 / value : 총 재생횟수)
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        // key로 이루어진 list 생성
        List<String> genreList = new ArrayList<>(map.keySet());
        // 총 재생횟수를 비교하여 총 재생횟수가 많은 장르로 내림차순 정렬
        genreList.sort((key1, key2) -> map.get(key2).compareTo(map.get(key1)));
        // 결과를 담을 list
        List<Integer> resultList = new ArrayList<>();

        int maxPlays = 0; // 재생횟수 최대 값
        int maxPlaysIdx = 0; // 재생횟수 최대 값일 때의 인덱스
        int nextPlaysIdx = 0; // 재생횟수 두번째로 큰 값일 때의 인덱스

        for(int i=0; i<genreList.size(); i++){
            // 재생횟수가 최대 값일 때의 인덱스(maxPlaysIdx) 구하기
            for(int j=0; j<genres.length; j++){
                if(genreList.get(i).equals(genres[j])){
                    if(maxPlays < plays[j]) {
                        maxPlays = plays[j];
                        maxPlaysIdx = j;
                    }else if(maxPlays == plays[j]){ // 재생횟수가 같을 때, 고유번호가 작은 것부터
                        if(j < maxPlaysIdx){
                            maxPlaysIdx = j;
                        }
                    }
                }
            }
            // 재생횟수 최대 값 초기화
            maxPlays = 0;

            // 재생횟수가 두번째로 큰 값일 때의 인덱스(nextPlaysIdx) 구하기
            for(int j=0; j<genres.length; j++){
              if(genreList.get(i).equals(genres[j])){
                  if(j != maxPlaysIdx && maxPlays < plays[j]){
                      maxPlays = plays[j];
                      nextPlaysIdx = j;
                  }else if(maxPlays == plays[j]){ // 재생횟수가 같을 때, 고유번호가 작은 것부터
                      if(j < nextPlaysIdx){
                          nextPlaysIdx = j;
                      }
                  }
              }
            }

            // 순서대로 list에 담기
            resultList.add(maxPlaysIdx);
            if(maxPlays != 0){
                resultList.add(nextPlaysIdx);
                maxPlays = 0;
            }
        }

        // answer에 list에 담긴 값 저장
        answer = new int[resultList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
