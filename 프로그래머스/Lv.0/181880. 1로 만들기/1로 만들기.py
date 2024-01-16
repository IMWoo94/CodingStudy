def solution(num_list):
    answer = 0
    for num in num_list:
        if not num :
            continue
        else:
            while num != 1:
                if not num % 2:
                    num = int(num / 2)
                else:
                    num = int((num -1) / 2)
                answer += 1
    return answer