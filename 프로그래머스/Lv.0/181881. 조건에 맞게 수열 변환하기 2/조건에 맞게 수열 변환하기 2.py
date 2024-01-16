def solution(arr):
    answer = 0
    
    while True:
        temp = arr[:] # 얇은 복사
        
        for i, num in enumerate(arr):
            if num >= 50 and not num % 2 :
                arr[i] = int(num / 2)
            elif num <= 50 and num % 2 :
                arr[i] = num * 2 + 1
        
        if temp == arr:
            break;
        else:
            temp = arr[:] # 얇은 복사
            answer += 1
    return answer