/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.University;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author harshikag
 */
public class StudentDashboardFinal extends javax.swing.JFrame {

    String[] semesterList = new String[]{"Fall 2021", "Spring 2021", "Summer 2021"};
    University uni;
    StudentProfile student;
    ImageIcon studentLogo = new ImageIcon("studentLogo2.jpeg");
    ImageIcon homeIcon = new ImageIcon("HomeIcon.png");
    ImageIcon courseIcon = new ImageIcon("courseIcon.jpeg");
    ImageIcon registerIcon = new ImageIcon("registerIcon.png");
    ImageIcon feedbackIcon = new ImageIcon("feedbackIcon.png");
    ImageIcon transcriptIcon = new ImageIcon("transcriptIcon.jpeg");
    ImageIcon gradesIcon = new ImageIcon("gradesIcon.png");
    ImageIcon logoutIcon = new ImageIcon("logoutIcon.png");
    ImageIcon jobIcon = new ImageIcon("Job.png");
    ImageIcon empIcon = new ImageIcon("employment.png");

    public void generateData() {
        // TODO add your handling code here:
        Department department1 = new Department("Information Systems");
        Department department2 = new Department("Engineering Management");

//        uni = 
        this.uni.getDepartmentList().add(department1);
        this.uni.getDepartmentList().add(department2);

        Course course = department1.newCourse("app eng", "info 5100", 4, "Data Structures, Algorithms");
        Course course1 = department2.newCourse("app dev", "info 5200", 4, "Data Structures, Algorithms");
//
//
        CourseSchedule courseschedule = department1.newCourseSchedule("Fall 2021");
//       CourseSchedule courseschedule = department2.newCourseSchedule("Fall 2021");      

//
        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        CourseOffer courseoffer1 = department2.newCourseSchedule("Fall 2021").newCourseOffer("info 5200");

        courseoffer.generatSeats(10);
        courseoffer1.generatSeats(20);
        PersonDirectory pd = department1.getPersonDirectory();
        Person person = pd.newPerson("0112303", 26.0, "harshika@gmail.com", "123-345", "Boston", "Harshika", "Harshika");
        StudentDirectory sd = department1.getStudentDirectory();
        this.student = sd.newStudentProfile(person);
        CourseLoad courseload = student.newCourseLoad("Fall 2021");

        courseload.newSeatAssignment(courseoffer);
        courseload.newSeatAssignment(courseoffer1);
    }

    /**
     * Creates new form StudentDashboardFinal
     */
    public StudentDashboardFinal(University university, StudentProfile sp) {
        initComponents();
        setResizable(false);
        setSize(1440, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        uni = university;
        logoLabel.setIcon(studentLogo);
        homeLabel.setIcon(homeIcon);
        courseLabelImg.setIcon(courseIcon);
        registerLabelImg.setIcon(registerIcon);
        feedbaclLabelImg.setIcon(feedbackIcon);
        gradesLabelImg.setIcon(gradesIcon);
        logoutImgLabel.setIcon(logoutIcon);
        jobImg.setIcon(jobIcon);
        employmentImg.setIcon(empIcon);
        //uni.setData();
        student = sp;
        System.out.println("sp" + sp.getId());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        HomeButton = new javax.swing.JButton();
        RegisterACourse = new javax.swing.JButton();
        Courses1 = new javax.swing.JButton();
        StudentFeedback = new javax.swing.JButton();
        GradesButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        homeLabel = new javax.swing.JLabel();
        courseLabelImg = new javax.swing.JLabel();
        registerLabelImg = new javax.swing.JLabel();
        feedbaclLabelImg = new javax.swing.JLabel();
        gradesLabelImg = new javax.swing.JLabel();
        logoutImgLabel = new javax.swing.JLabel();
        GradesButton1 = new javax.swing.JButton();
        GradesButton2 = new javax.swing.JButton();
        employmentImg = new javax.swing.JLabel();
        jobImg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(239, 242, 239));

        jPanel1.setBackground(new java.awt.Color(68, 71, 68));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 436));

        jLabel1.setBackground(new java.awt.Color(248, 248, 243));
        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 248, 243));
        jLabel1.setText("Student");

        HomeButton.setBackground(new java.awt.Color(0, 0, 0));
        HomeButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(248, 248, 243));
        HomeButton.setText("Profile");
        HomeButton.setBorderPainted(false);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        RegisterACourse.setBackground(new java.awt.Color(0, 0, 0));
        RegisterACourse.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        RegisterACourse.setForeground(new java.awt.Color(248, 248, 243));
        RegisterACourse.setText("Register");
        RegisterACourse.setBorderPainted(false);
        RegisterACourse.setContentAreaFilled(false);
        RegisterACourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterACourseActionPerformed(evt);
            }
        });

        Courses1.setBackground(new java.awt.Color(0, 0, 0));
        Courses1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Courses1.setForeground(new java.awt.Color(248, 248, 243));
        Courses1.setText("Courses");
        Courses1.setBorderPainted(false);
        Courses1.setContentAreaFilled(false);
        Courses1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Courses1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Courses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Courses1ActionPerformed(evt);
            }
        });

        StudentFeedback.setBackground(new java.awt.Color(0, 0, 0));
        StudentFeedback.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        StudentFeedback.setForeground(new java.awt.Color(248, 248, 243));
        StudentFeedback.setText("Feedback");
        StudentFeedback.setBorderPainted(false);
        StudentFeedback.setContentAreaFilled(false);
        StudentFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentFeedbackActionPerformed(evt);
            }
        });

        GradesButton.setBackground(new java.awt.Color(0, 0, 0));
        GradesButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        GradesButton.setForeground(new java.awt.Color(248, 248, 243));
        GradesButton.setText("Job");
        GradesButton.setBorderPainted(false);
        GradesButton.setContentAreaFilled(false);
        GradesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GradesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradesButtonActionPerformed(evt);
            }
        });

        LogoutButton.setBackground(new java.awt.Color(0, 0, 0));
        LogoutButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(248, 248, 243));
        LogoutButton.setText("Logout");
        LogoutButton.setBorderPainted(false);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        GradesButton1.setBackground(new java.awt.Color(0, 0, 0));
        GradesButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        GradesButton1.setForeground(new java.awt.Color(248, 248, 243));
        GradesButton1.setText("Employment");
        GradesButton1.setBorderPainted(false);
        GradesButton1.setContentAreaFilled(false);
        GradesButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GradesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradesButton1ActionPerformed(evt);
            }
        });

        GradesButton2.setBackground(new java.awt.Color(0, 0, 0));
        GradesButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        GradesButton2.setForeground(new java.awt.Color(248, 248, 243));
        GradesButton2.setText("Grades");
        GradesButton2.setBorderPainted(false);
        GradesButton2.setContentAreaFilled(false);
        GradesButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GradesButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradesButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registerLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Courses1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RegisterACourse))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(employmentImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                            .addComponent(logoutImgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                            .addComponent(jobImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(GradesButton1)
                                            .addComponent(GradesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LogoutButton)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(feedbaclLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(gradesLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(GradesButton2)
                                            .addComponent(StudentFeedback))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(courseLabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Courses1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterACourse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerLabelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StudentFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feedbaclLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GradesButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(gradesLabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GradesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jobImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GradesButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employmentImg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutImgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(239, 242, 239));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        LoginForm lg = new LoginForm();
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void GradesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradesButtonActionPerformed
        // TODO add your handling code here:
        StudentEmploymentDetails sed = new StudentEmploymentDetails(student, uni);
        jSplitPane1.setRightComponent(sed);
    }//GEN-LAST:event_GradesButtonActionPerformed

    private void StudentFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentFeedbackActionPerformed
        // TODO add your handling code here:

        StudentEmployment se = new StudentEmployment(student, uni);
        jSplitPane1.setRightComponent(se);
    }//GEN-LAST:event_StudentFeedbackActionPerformed

    private void Courses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Courses1ActionPerformed
        // TODO add your handling code here:
        
        ArrayList<FacultyProfile> teacherlist = uni.getDepartmentList().get(0).getFacultydirectory().getTeacherlist();
        //StudentProfile student = uni.getDepartmentList().get(0).getStudentDirectory().findStudent("12206");

        StudentsCourses sc = new StudentsCourses(uni.getDepartmentList().get(0), uni.getDepartmentList().get(0).getCourseSchedule("Fall2020"), student);

        jSplitPane1.setRightComponent(sc);

    }//GEN-LAST:event_Courses1ActionPerformed

    private void RegisterACourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterACourseActionPerformed
        // TODO add your handling code here:
        generateData();
        System.out.println(this.uni.getDepartmentList() + "  ....");
        CourseRegistration cr = new CourseRegistration(semesterList, this.uni, student);
        jSplitPane1.setRightComponent(cr);
    }//GEN-LAST:event_RegisterACourseActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        StudentHome stud = new StudentHome(uni, student);
        jSplitPane1.setRightComponent(stud);
        
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void GradesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradesButton1ActionPerformed
        // TODO add your handling code here:
        StudentEmploymentHistory seh = new StudentEmploymentHistory(student, uni);
        jSplitPane1.setRightComponent(seh);
    }//GEN-LAST:event_GradesButton1ActionPerformed

    private void GradesButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradesButton2ActionPerformed
        // TODO add your handling code here:
        //StudentProfile findStudent = sd.findStudent("Harshika");
        ArrayList<String> courseStudent = student.getTranscript();
        student.getGPA();
        StudentGrades sg = new StudentGrades(student, uni);
        jSplitPane1.setRightComponent(sg);
    }//GEN-LAST:event_GradesButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(StudentDashboardFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(StudentDashboardFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(StudentDashboardFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(StudentDashboardFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                StudentDashboardFinal sd = new StudentDashboardFinal();
////              sd.setResizable(false);
//                sd.setSize(1440, 800);
//                sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                sd.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Courses1;
    private javax.swing.JButton GradesButton;
    private javax.swing.JButton GradesButton1;
    private javax.swing.JButton GradesButton2;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton RegisterACourse;
    private javax.swing.JButton StudentFeedback;
    private javax.swing.JLabel courseLabelImg;
    private javax.swing.JLabel employmentImg;
    private javax.swing.JLabel feedbaclLabelImg;
    private javax.swing.JLabel gradesLabelImg;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel jobImg;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoutImgLabel;
    private javax.swing.JLabel registerLabelImg;
    // End of variables declaration//GEN-END:variables
}