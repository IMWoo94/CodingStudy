def solution(nums):
    answer = 0

    arr = set(nums)
    
    if len(arr) >= len(nums)/2 :
        answer = len(nums)/2
    else :
        answer = len(arr)
    
    return answer