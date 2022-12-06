# Yorizori_mybatis

✨## 프로젝트 목표
1. 처음으로 스프링부트와 mybatis를 사용하면서 익혀보기
2. JDBC → Mybatis로 프레임워크 하나를 바꾸는데 얼마나 많은 시간이 걸릴지에 대한 궁금증
3. 추가적인 스프링 기능 사용

## 기능
기능 번호|주요 기능|설명|
---|---|---|
기능1|메인화면에 리스트 보여주기|최신날짜 순서로 메인화면에 요리책을 나열합니다.|
기능2|로그인|아이디 저장 기능과 함께 로그인 로그아웃 기능을 구현합니다.|
기능3|요리책 등록|회원은 요리책을 등록할 수 있습니다.|
기능4|요리책 목록|회원이 아니어도 현재 웹에 등록되어 있는 요리책 목록을 볼 수 있습니다.|
기능5|레시피 목록|각 요리책에 등록되어있는 레시피들의 목록들을 볼 수 있습니다.|
기능6|레시피 상세보기|등록되어 있는 레시피의 내용을 상세하게 봅니다.|

## 화면  
### Main 화면  

![Main](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/d433f189-3cb2-4eba-8a85-fdacbd5e23be/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221206%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221206T110520Z&X-Amz-Expires=86400&X-Amz-Signature=7ffa713cd3af34cd3df1b12aed712980a40fe7df2d3c28c00fb1805070f70e48&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22Untitled.png%22&x-id=GetObject)
> +기능1의 내용과 같이 최신 날짜 순서대로 나열한 모습  

### 요리책 등록 화면  
![요리책 등록](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/2478b20a-ab3d-4e24-bd6c-ff9cc5a685f9/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221206%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221206T110922Z&X-Amz-Expires=86400&X-Amz-Signature=fe0bd0c09db7a64acd1307129e066a04dadfb75ab811e43549b210be61725279&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22Untitled.png%22&x-id=GetObject)
> 로그인한 사람만 등록이 가능한 페이지  

### 요리책 목록 화면    
![요리책 목록](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3ef21f8b-c02d-4830-91bd-430cef7be953/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221206%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221206T110752Z&X-Amz-Expires=86400&X-Amz-Signature=9414550cfd08cc56378eefab62e4867eb3ce4c525bcf022470ab87e1c80689c4&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22Untitled.png%22&x-id=GetObject)
>등록되어잇는 요리책 리스트를 보여줍니다.
이 화면에서는 새로운 레시피 내용을 등록 또는 요리책에 등록되어 있는 레시피 총 목록도 확인 가능합니다.  

### 레시피 목록 조회  
![레시피 목록](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ddff5fd0-f747-4fe5-af07-47c92c542655/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221206%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221206T110847Z&X-Amz-Expires=86400&X-Amz-Signature=688d21900cfb533534811b6465ed28bfce792dd6e6b1ad934c7f5c4c39d1b2a9&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22Untitled.png%22&x-id=GetObject)
>요리책에 등록되어 있는 레시피 리스트들을 보여줍니다.  

### 레시피 상세 화면    
![레시피 상세](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/fd0f07de-370e-49d4-8d92-d6b637933dae/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221206%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221206T111003Z&X-Amz-Expires=86400&X-Amz-Signature=7b4acd551c8f738383ebc5eec517282f118b0b4a6acb47ef7710d5a663c17e06&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22Untitled.png%22&x-id=GetObject)

### 국제화 처리 완료
+ 한국어 버전
![한국어 버전](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/76e723c8-d191-4548-8b18-b76f35d6a438/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221206%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221206T111123Z&X-Amz-Expires=86400&X-Amz-Signature=59050193b4c42a1f98e02a4d725d492e9a5c15406ffe4db42b7e7cb09ed44407&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22Untitled.png%22&x-id=GetObject)
+ 영어 버전
![영어 버전](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3957b640-336a-4661-99f2-f9225cb3c44c/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221206%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221206T111152Z&X-Amz-Expires=86400&X-Amz-Signature=d686e63f90f470fb0d397cdba8cebeed80c4cd4085e5fa1eb18bd7e0dbbb6bb9&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22Untitled.png%22&x-id=GetObject)

### 유효성 검증
![유효성 검증](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/a86ec713-31e5-447d-8846-9a29523d210b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221206%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221206T111207Z&X-Amz-Expires=86400&X-Amz-Signature=7b13ae1f1cadf9d1f7cde58204a0bc3f620c138fa471e146b7d2169e2004e23b&X-Amz-SignedHeaders=host&response-content-disposition=filename%3D%22Untitled.png%22&x-id=GetObject)

## 🤔어려웠던 점

+ Mybatis는 xml과 application.properties를 이용한 기초 세팅이 필요한데 경로 설정하는 방식이 아직 익숙하지 않아서 처음 오류가 났을 때 왜 오류가 발생했는 지 찾을 때 생소한 오류를 봐서 당황했습니다.

+ JSP와 다른 쿠키 활용
> JSP에서는 원하는 쿠키를 [쿠키.쿠키Name]으로 불러올 수 있었습니다.
그러나, 타임리프에서는 #request.getcookies로 쿠키 list를 불러와야했고 각 쿠키를 사용하기위해서는 th:each 문을 사용했어야 했습니다.
결과적으로는 반복문을 돌리게 되면 원하지 않는 결과가 나왔고 아래와 같이 controller 클래스에서 새로운 코드를 추가했어야 했습니다.
(보안을 위해서는 session을 사용하는게 맞지만, 최대한 이전의 프로젝트와 같은 코드를 구현해보고 싶었습니다.)

```java
@GetMapping("/user/login.do")
    public String getLogOut(HttpServletRequest request, HttpServletResponse response, RedirectAttributes redirect) {
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                // 쿠키의 이름을 가져와서 비교한다.
                String name = cookie.getName();
                if (name.equalsIgnoreCase("loginid")) {
                    cookie.setPath("/");
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);

                }
                if (name.equalsIgnoreCase("saveid")) {
                    redirect.addAttribute("saveid",cookie.getValue());
//cookie에 saveid가 있다면, Redirect로 saveid를 url로 다시 기억하게함
	// 이 param을 html에서 사용해서 view로 보여줌

                }
            }

        }
        return "redirect:/";
    }

    @PostMapping("/user/login.do")
    public String Login(@RequestParam("id") String id,
                        @RequestParam("passwd") String passwd,
                        @RequestParam("saveid") String saveid,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        RedirectAttributes redirect,
                        Model model
                        ){

        User loginUser = userService.findByIdAndPasswd(id,passwd);


        if (loginUser != null) {
            Cookie loginCookie = new Cookie("loginid", loginUser.getId());
            loginCookie.setPath("/");
            response.addCookie(loginCookie);

            redirect.addAttribute("loginid",loginUser.getId());
            redirect.addAttribute("loginStat", true);
//redirect로 loginid와 loginStat(로그인 상태)를 기억하게 함
	//이 param을 이용해서 로그인했을 때와 안했을 때의 화면을 구분하게 함

            if (saveid != null) {
                Cookie saveidCookie = new Cookie("saveid", loginUser.getId());
                saveidCookie.setPath("/");
                saveidCookie.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(saveidCookie);


            }


            return "redirect:/";
        } else {
            // 회원가입이 안되어있으면 로그인 화면으로 다시 유도
            return  "redirect:/user/loginform.do";
        }
```
+ HTML (타임리프)
```html
//redirect로 받은 param을 활용해서 login 가능 여부를 구별함
<th:block th:if="${param.get('loginStat')}">
            <div class="col-4">
              [[${param.get('loginid')}]]님 환영합니다.
              <button type="button" class="btn btn-danger"
                      onclick="location.href='/user/login.do'">로그아웃</button>
            </div>
          </th:block>
        <!--/* 로그인 실패시 */-->
          <th:block th:if="${param.get('loginStat') == null}">
            <form class="row row-cols-lg-auto g-3 align-items-center"
                  method="post" action="/user/login.do">
              <div class="col-12">
                <div class="form-check">
                  <input class="form-check-input" type="checkbox" id="saveid"
                         name="saveid" value="save" checked> <label
                        class="form-check-label" for="saveid">아이디저장</label>
......
```

+ JDBC와 다른 SQL 활용법  
**과거 JDBC에서 코드**
```java
@Override
	public void create(ReciepeProcedure ReciepeProcedure) throws RuntimeException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sb = new StringBuilder();
		sb.append(" INSERT INTO recipe_procedure(RECIPE_ID, SEQ_NUM, PROCEDURE) ")
				.append("   VALUES ( (SELECT recipe_id FROM recipe WHERE recipe_id = ?) ,?,?) ");

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sb.toString());

			String[] procedures = ReciepeProcedure.getProcedure();

			for (int SeqNum = 1; SeqNum <= ReciepeProcedure.getSeqNum(); SeqNum++) {
				pstmt.setInt(1, ReciepeProcedure.getReceipeId());
				pstmt.setInt(2, SeqNum);
				pstmt.setString(3, procedures[SeqNum-1]);	
				pstmt.addBatch();
			}

			// Query Update
			pstmt.executeBatch();
			 conn.commit();
		} catch (SQLException e) {
			// SQL Exception을 RuntimeException으로 변환
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
```
✔ JDBC에서는 SQL문을 만들고 실행하는 Dao클래스에서 for문을 돌렸습니다.
Why? 요리 절차는 List로 받았기 때문에 각 절차를 순서에 맞게 DB에 저장해주기 위해서입니다.

💬**Mybatis의 경우**
```xml
<insert id="create" parameterType="ReciepeProcedure">
        INSERT INTO recipe_procedure(RECIPE_ID, SEQ_NUM, PROCEDURE)
        VALUES
            ((SELECT recipe_id FROM recipe WHERE recipe_id = #{receipeId}),
            #{seqNum},
            #{procedure}
            )
    </insert>
```
```java
//procedure가 배열이어서 반복문으로 돌려가면서 등록해줌
        ReciepeProcedure rp = new ReciepeProcedure();
        for(int i = 0; i<procedure.length; i++){
            rp.setReceipeId(RecipeId);
            rp.setSeqNum((i+1));
            rp.setProcedure(procedure[0]);
            recipeProcedureService.create(rp);
        }
```
✔xml에서는 insert문을 정석대로 만들고, controller클래스에 for문을 돌려가면서 순차적으로 전부 insert해줬습니다.
mybatis도 for문을 지원해준다? → xml에는 깔끔한 SQL문을 쓰고, 그 외의 필요한 부분은 controller에서 작성하는게 맞지 않을까?.. 라는 생각을 해서 이런 코드를 작성하게 되었습니다.

+ th:src의 링크를 다는 방법
✔BEFORE
```html
<img class="card-img-top"
                     th:src="@{/assets/${Recipe.getImgFileName()}}"
                     th:alt="${Recipe.getImgFileName()}" />
                <!-- 레시피 details-->
```
✔AFTER
```html
<img class="card-img-top"
                     th:src="@{/assets/}+${Recipe.getImgFileName()}"
                     th:alt="${Recipe.getImgFileName()}" />
                <!-- 레시피 details-->
```
**사소하지만, 절대 사소하지 않았던 코드 문법**
>이전 코드로 작성했을 때는 이미지 경로가 잡하지 않아서 한참을 고민하다가 결국 방법을 생각해내지 못해서 검색해보았습니다.
그 결과 + 연산자를 사용해서 연결하면 된다는 것을 알고 얼마나 허무했는지.. 이런게 코드의 묘미가 아닌가 싶습니다.
*내가 정답이라고 확신했던 코드가 정답이 아닐 수도 있다는 점을 항상 상기하도록 하게 하는 계기가 되었습니다.

+ Mybatis를 사용하기 위해서는 DB 테이블과 매핑
```java
@PostMapping
    public String doPost(@ModelAttribute("recipe") Recipe recipe,
                         @RequestParam(value = "procedure", required = false, defaultValue = "") String[] procedure){




        MultipartFile imgfilename = recipe.getImgfilename();
        String FileName = recipe.getImgfilename().getOriginalFilename();
        String contentType = null;

        try {
            if (!imgfilename.isEmpty()) {
                Path path = Paths.get(location + FileName);
                contentType = Files.probeContentType(path);
                imgfilename.transferTo(new File(path.toString()));
            }

        }catch (IOException e){
            throw  new YzRuntimeException();
        }


        //recipeID를  넣어주기 위한 PFK 생성
        Random rd = new Random();//랜덤 객체 생성
        int RecipeId = (rd.nextInt(500)+1);
        RecipeJoinRecipePro recipeJoinRecipePro = new RecipeJoinRecipePro();



        recipeJoinRecipePro.setRecipetime(recipe.getRecipetime());
        recipeJoinRecipePro.setRecipelevel(recipe.getRecipelevel());
        recipeJoinRecipePro.setRecipename(recipe.getRecipename());
        recipeJoinRecipePro.setWriterid(recipe.getWriterid());
        recipeJoinRecipePro.setImgconttype(contentType);
        recipeJoinRecipePro.setIngredients(recipe.getIngredients());
        recipeJoinRecipePro.setBookid(recipe.getBookid());
        recipeJoinRecipePro.setRecipeid(RecipeId);
        recipeJoinRecipePro.setImgfilename(FileName);
        recipeService.create(recipeJoinRecipePro);


        //procedure가 배열이어서 반복문으로 돌려가면서 등록해줌
        ReciepeProcedure rp = new ReciepeProcedure();
        for(int i = 0; i<procedure.length; i++){
            rp.setRecipeid(RecipeId);
            rp.setSeqNum((i+1));
            rp.setProcedure(procedure[0]);
            recipeProcedureService.create(rp);
        }

        return "redirect:/cookbook/list.do";
    }
```
>recipeJoinRecipePro는 mybatis와 mapping을 하기위해서 생성한 Bean입니다.
 → html에서의 정보를 받아올려면 recipeJoinRecipePro를 사용해서 set할 필요가 있었습니다.
→ recipe객체를 사용하면 setImgfilename()이 Multipartfile 타입이라 mapping되지 못한 것도 예상외여서 생각하는데 상당한 시간이 걸렸습니다.
→ 코드를 깔끔하게 줄여쓰지 못한것은 아쉽지만 최선의 방법이라고 생각합니다.

##아쉬운 점과 배운점
+ Recipe 빈과 RecipeProcedure의 Param값을 한번에 받게 설계된 html
```html
<section class="py-5">
  <div class="container">
    <div class="row">
      <div class="col-lg-9">
        <div class="col-auto h2">레시피 등록</div>
        <!-- recipe Form -->
        <form class="row g-3" action="/recipe/register.do" method="post" enctype="multipart/form-data" th:object="${recipe}">
          <div class="col-md-6">
            <label for="receipeName" class="form-label">레시피명</label>
            <input type="text" class="form-control" th:field="*{receipeName}">
          </div>
          <div class="col-md-6">
            <label for="WriterId" class="form-label">등록자 아이디</label>
            <input type="text" class="form-control" th:value="${param.get('writerId')}" disabled>
            <input type="hidden" th:value="${param.get('writerId')}" th:field="*{writerId}">

            <label for="bookId" class="form-label">쿡북코드</label>
            <input type="text" class="form-control" th:value="${param.get('bookId')}" disabled>
            <input type="hidden" th:value="${param.get('bookId')}" th:field="${bookId}">
          </div>
....
```
```java
@PostMapping
    public String doPost(@ModelAttribute("recipe") Recipe recipe,
                         @RequestParam(value = "procedure", required = false, defaultValue = "") String[] procedure){


        MultipartFile imgfilename = recipe.getImgfilename();
        String FileName = recipe.getImgfilename().getOriginalFilename();
        String contentType = null;

        try {
            if (!imgfilename.isEmpty()) {
                Path path = Paths.get(location + FileName);
                contentType = Files.probeContentType(path);
                imgfilename.transferTo(new File(path.toString()));
            }

        }catch (IOException e){
            throw  new YzRuntimeException();
        }


        //recipeID를  넣어주기 위한 PFK 생성
        Random rd = new Random();//랜덤 객체 생성
        int RecipeId = (rd.nextInt(500)+1);
        RecipeJoinRecipePro recipeJoinRecipePro = new RecipeJoinRecipePro();



        recipeJoinRecipePro.setRecipetime(recipe.getRecipetime());
        recipeJoinRecipePro.setRecipelevel(recipe.getRecipelevel());
        recipeJoinRecipePro.setRecipename(recipe.getRecipename());
        recipeJoinRecipePro.setWriterid(recipe.getWriterid());
        recipeJoinRecipePro.setImgconttype(contentType);
        recipeJoinRecipePro.setIngredients(recipe.getIngredients());
        recipeJoinRecipePro.setBookid(recipe.getBookid());
        recipeJoinRecipePro.setRecipeid(RecipeId);
        recipeJoinRecipePro.setImgfilename(FileName);
        recipeService.create(recipeJoinRecipePro);


        //procedure가 배열이어서 반복문으로 돌려가면서 등록해줌
        ReciepeProcedure rp = new ReciepeProcedure();
        for(int i = 0; i<procedure.length; i++){
            rp.setRecipeid(RecipeId);
            rp.setSeqNum((i+1));
            rp.setProcedure(procedure[0]);
            recipeProcedureService.create(rp);
        }

        return "redirect:/cookbook/list.do";
    }
```
>  recipe + recipeProcedure의 프로퍼티들을 한번에 받기 위한 RecipeJoinRecipePro 빈을 활용해서 Param들을 받아야했습니다.
+) mybatis와 mapping하기 위한 용도임을 나중에 깨닫게 됨

< 결과 >
→ recipeProcedureService.create(ReciepeProcedure); 는 recipeProcedureService객체만 받아야했기 때문에 위의 코드처럼 recipeJoinRecipePro.set~ 으로 하나씩 다 값을 넣어줘야했습니다.
→ 스프링 부트의 @ModelAttribute 어노테이션 장점을 살리지 못했다는 생각이 들었습니다.
Why? Recipe로 @modelAttribute를 받았는가?
recipeForm.html에서 사진 이미지를 업로드 받기 위해서는 Multipartfile 객체로 받아야했기 때문입니다.
=> **프로젝트 종료후에 깨달은 점은 각 Form에서 받아야하는 프로퍼티에 따른 Bean 객체를 생성해 주는 것이 훨씬 더 좋은 방법이라는 것을 깨달았습니다.**

#총 평가
💥이번 프로젝트는 순전히 저 스스로가 해보고 싶어서 시작한 작은 프로젝트입니다.💥  

이전에 완성되어있던 JDBC, 서블릿으로 작성되어 있던 코드들을 Spring boot, thymeleaf, mybatis로 바꾸는 것이기 때문에 처음에 시작할때는 금방 끝낼 수 있을 것이라고 생각했습니다.
그러나, 프레임워크와 DB접근 방식, view의 사용 스킬이 바뀐것은 엄청난 차이를 불러왔고, 2일짜리 프로젝트라고 생각했던 것은 일주일 넘는 긴 시간을 필요로 했습니다.

**느낀점**: 1. Spring boot의 중요 요소중인 하나 [PSA]가 얼마나 멋진 기술인지 알게 해주는 계기가 되었다고 생각합니다.
           2. 프레임워크의 변경이 얼마나 큰 코드의 변경을 불러오는지 알게되었습니다.
           3. SOLID 법칙중, 스프링을 사용함으로서 지킬 수 있는 IOC, OCP 법칙을 조금이나마 이해하게 되었습니다.

👍 [PSA](https://www.notion.so/Spring-Framework-1-ccc082f7a7b744129acdde17d8da9457#e40d969f15c240789e15ca23bfcea24c)



