import re

def solution(files):
    answer = []
    sortlist = []
#     file = []
    
#     # 정규식 이용하여, head, number, tail 분리
    p = re.compile('([a-zA-Z- .]+)([0-9]+)')
    
    # sttest = "foo010bar020.zip"
    # test = p.findall(sttest)
    # print(test)
    # print(re.split(r"([0-9]+)", sttest))
    
    for num , st in enumerate(files):
        # 정규식으로 (head, number, tail)
        file = p.findall(st)
        # head 부분을 대소문자 구분하지 않고 정렬하기 위해 소문자로 모두 변환
        a = file[0][0].lower()
        # number 부분을 숫자화 하여서 앞자리 0 을 없앤다.
        b = file[0][1]
        # 파일 리스트의 파일명 원복
        sortlist.append([a,b,st])
        
    # 소문자인 head 기준으로 사전적 정렬, number 부분을 기준으로 사전적 정렬
    temp = sorted(sortlist, key = lambda text: (text[0], int(text[1])))
    for filename in temp:
        answer.append(filename[2])
        

#     # 1. 숫자를 기준으로 정규식을 사용하여 head, number, tail  을 구분
#     temp2 = [ re.split(r"([0-9]+)", s) for s in files ]
#     print("2")
#     print(temp2)
#     # 2.
#     sort = sorted(temp2, key = lambda x : (x[0].lower(), int(x[1])))
    
#     answer =[ "".join(s) for s in sort]
    
    return answer