def solution(n, arr1, arr2):
    answer = []
    for i in range(n) :
        # 각 지도별 리스트에 있는  or 문으로 정립
        a = arr1[i] | arr2[i] 
        
        # format 형식을 사용해서 10진수의 정수를 2진수로 변환 (변환 시 '#b'를 넣으면 접두어가 붙는다.)
        # zfill() 현재 스트링 길이 - 갯수 만큼 채울 수 있다. 문자열 타입에서 원하는 갯수만큼 0 채우기
        a = format(a,'b').zfill(n)
        
        # 리스트에 담기전에 문자열 치환 작업
        a = a.replace("1","#").replace("0", " ")
        answer.append(a)
    
    return answer