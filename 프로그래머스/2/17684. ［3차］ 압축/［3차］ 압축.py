import string 

def solution(msg):
    answer = []
    
    # 초기 딕셔러니 생성
    dic = {}
    for num,st in enumerate(string.ascii_uppercase):
        dic[st] = num+1
        
    name = []
    cnt = 0
    # 문자열의 내용 반복문
    for n, s in enumerate(msg):
        if cnt :
            cnt -= 1
            continue
            
        else :
            # 첫번째 문자열에 대해서 사전에 존재하는지 최대 문자열 갯수 까지 늘려가면서 확인
            for i in range(1,len(msg)+1): # 1 부터 시작
                if msg[n:n+i] in dic:
                    cnt += 1
                    name.append(msg[n:n+i])
                    continue
                else :
                    dic[msg[n:n+i]] = len(dic)+1
                    answer.append(dic[msg[n:n+i-1]])
                    cnt -= 1
                    break

    answer.append(dic[name[-1]])

    return answer