def solution(intStrs, k, s, l):
    answer = [int(num[s:s+l]) for num in intStrs if int(num[s:s+l]) > k]
    return answer