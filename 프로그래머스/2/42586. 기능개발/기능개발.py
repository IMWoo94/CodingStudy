def solution(progresses, speeds):
    answer = []
    days = 0
    cnt = 0
    while len(progresses) > 0:
        if progresses[0] + speeds[0] * days >= 100:
            progresses.pop(0)
            speeds.pop(0)
            cnt += 1
        else:
            days += 1
            if cnt > 0:
                answer.append(cnt)
                cnt = 0
    answer.append(cnt)
    return answer