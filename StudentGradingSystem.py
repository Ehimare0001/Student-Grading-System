
students = int(input("Number of students: "))

subjects = int(input("Number of subjects: "))

scores = []
totals = []

for learner in range(students):

    student_scores = []
    total = 0

    for subject in range(subjects):

        score = int(input("Enter score: "))

        while score < 0 or score > 100:
            print("Invalid score, please enter a score between 0 and 100")
            score = int(input("Enter score: "))

        student_scores.append(score)

        total = total + score

    scores.append(student_scores)
    totals.append(total)


for learner in range(students):

    print("\nStudent", learner + 1)

    for subject in range(subjects):

        student_score = scores[learner][subject]

        print("Subject", subject + 1)
        print("Score:", student_score)

    print("Total:", totals[learner])

    average = totals[learner] / subjects

    print("Average:", average)
