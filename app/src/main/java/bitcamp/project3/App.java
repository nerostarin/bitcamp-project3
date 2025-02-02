package bitcamp.project3;

import bitcamp.project3.menu.MenuItem;
import bitcamp.project3.menu.MenuGroup;
import bitcamp.project3.util.Prompt;
import bitcamp.project3.command.signin.SignIn;
import bitcamp.project3.command.signup.SignUp;
import bitcamp.project3.vo.Book;
import bitcamp.project3.vo.User;

import java.util.ArrayList;
import java.util.List;

public class App {

    MenuGroup mainMenu = new MenuGroup("메인");

    List<Book> bookList = new ArrayList<>();
    List<User> userList = new ArrayList<>();

    public App()
    {
        mainMenu.add(new MenuItem("로그인", new SignIn(userList, bookList)));
        mainMenu.add(new MenuItem("회원가입", new SignUp(userList)));
    }

    public static void main(String[] args) {
        new App().execute();
    }

    void execute()
    {
        addBook();
        addUser();
        try{
            mainMenu.execute();
        }catch (Exception e)
        {
            System.out.println("오류가 발생하였습니다");
        }
        Prompt.close();
    }
    

    public void addBook()
    {
        Book[] bookTest = {
                new Book("스즈메의 문단속","신카이 마코토","소설",false),
                new Book("달러구트 꿈 백화점","이미예","소설",true),
                new Book("달러구트 꿈 백화점 2","이미예","소설",false),
                new Book("불편한 편의점","김호연","소설",true),
                new Book("메리골드 마음 세탁소","윤정은","소설",false),
                new Book("꽃을 보듯 너를 본다 ","나태주","시",true),
                new Book("자바의 정석","신용권","컴퓨터",true),
                new Book("나는 오래된 거리처럼 너를 사랑하고","진은영","시",true),
                new Book("떠먹여 줄테니 따라와 엄진영의 코딩 스쿨","엄진영","공부",false),
                new Book("임신 출산 육아 대백과 최신개정판","삼성출판사","가정생활",true),
                new Book("최소한의 한국사","최태성","역사",false),
                new Book("test1","test1","1",true),
                new Book("test2","test2","2",true),
                new Book("test3","test3","3",true),
        };
        for (Object object : bookTest)
        {
            Book book = (Book) object;
            bookList.add(book);
        }
    }

    public void addUser()
    {
        String[] a = new String[]{null,null,null};
        String[] b = new String[]{"왕좌의 게임1","왕좌의 게임2","왕좌의 게임3"};
        String[] c = new String[]{"돈의속성","돈을 부르는 매너","세이노의 가르침"};
        String[] d = new String[]{"호감의 시작","너에게 들려주는 단단한 말","만일 나에게 한 번의 아침이 남아 있다면"};
        String[] e = new String[]{"나는 도대체 왜 피곤할까","초역 부처의 말","죽이고 싶은 아이2"};

        User[] userTest = {
                new User("admin","admin","1234", a,true),
                new User("테스트1","test1","1234", b,false),
                new User("테스트2","test2","5678", c,false),
                new User("테스트3","test3","9101", d,false),
                new User("테스트4","test4","1213", e,false)
        };
        for (Object object : userTest)
        {
            User user = (User) object;
            userList.add(user);
        }
    }
}

