package jdbc.sec05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertInputBookMain {
    public static void main(String[] args) {
        DBConnect dbCon = new DBConnect();
        Connection con = dbCon.getConnection();
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("도서번호 입력 : ");
            String bookNo = sc.nextLine();

            System.out.print("도서명 입력 : ");
            String bookName = sc.nextLine();

            System.out.print("도서저자 입력 : ");
            String bookAuthor = sc.nextLine();

            System.out.print("도서가격 입력 : ");
            int bookPrice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            System.out.print("출판일 입력 : ");
            String bookDate = sc.nextLine();

            System.out.print("도서재고 입력 : ");
            int bookStock = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            System.out.print("출판사번호 입력 : ");
            String pubNo = sc.nextLine();

            String sql = "insert into book values(?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, bookNo);
            pstmt.setString(2, bookName);
            pstmt.setString(3, bookAuthor);
            pstmt.setInt(4, bookPrice);
            pstmt.setString(5, bookDate);
            pstmt.setInt(6, bookStock);
            pstmt.setString(7, pubNo);

            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("도서등록 성공");
            } else {
                System.out.println("도서등록 실패");
            }

            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}