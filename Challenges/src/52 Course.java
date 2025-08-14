class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrolledStudents;
    String[] enrolledStudentNames;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = 0;
        this.enrolledStudentNames = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        if (enrolledStudents >= maxCapacity) {
            System.out.println("Students are maximum in this course");
            return;
        }

        // Check if already enrolled
        int i = 0;
        boolean found = false;
        while (i < enrolledStudents) {
            if (enrolledStudentNames[i].equals(studentName)) {
                found = true;
                break;
            }
            i++;
        }

        if (found) {
            System.out.println("Student is already in the course");
        } else {
            enrolledStudentNames[enrolledStudents] = studentName;
            enrolledStudents++;
            System.out.println("Student joined the course, Welcome "+studentName);
        }
    }

    void unenrollStudent(String studentName) {
        int index = -1;
        int i = 0;

        // Search for the student
        while (i < enrolledStudents) {
            if (enrolledStudentNames[i].equals(studentName)) {
                index = i;
                break;
            }
            i++;
        }

        if (index != -1) {
            // Shift remaining students left
            int j = index;
            while (j < enrolledStudents - 1) {
                enrolledStudentNames[j] = enrolledStudentNames[j + 1];
                j++;
            }

            enrolledStudentNames[enrolledStudents - 1] = null;
            enrolledStudents--;
            System.out.println("Sorry to see you go, Welcome back any time");
        } else {
            System.out.println("Student already unenrolled from the course");
        }
    }

    public static void main(String[] args) {
        Course c = new Course("Java");
        c.enrollStudent("Ram"); // Student joined the course, Welcome
        c.enrollStudent("Sita"); // Student joined the course, Welcome
        c.enrollStudent("Ram"); // Student is already in the course

        c.unenrollStudent("Ram");
        c.enrollStudent("Ram");// Sorry to see you go, Welcome back any time
        c.unenrollStudent("Ram"); // Student already unenrolled from the course
    }
}
