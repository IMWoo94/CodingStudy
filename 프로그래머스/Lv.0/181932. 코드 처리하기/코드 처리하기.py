def solution(code):
    answer = ''
    print("".join(code.split("1"))[::2])
    #"".join(code.split("1"))[::2] or "EMPTY"
    mod = 0
    for i, str in enumerate(code, 0):
        if mod:
            if str == "1":
                mod = 0
            else :
                answer += str if i%2 else ''
        else:
            if str == "1":
                mod = 1
            else :
                answer += str if not i%2 else ''
    
    return answer if len(answer) > 0 else 'EMPTY'