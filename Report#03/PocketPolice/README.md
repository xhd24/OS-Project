# PocketPolice
<h3>1. 수정 시작하기 전에 늘 ★★★★git pull★★★★ 한 번 하고 시작할 것!!!!</h3>
<h3>2. 안드로이드 스튜디오에서 수정하기</h3>
<h3>3. 수정 완료</h3>
<h3>4. git add . => git commit -m "본인 이름"
<h2>4. ※★★★★다른 사람이 나보다 먼저 push 했을 수도 있으므로 이때도 git pull 한번더★★★★※ 에러 날 경우 4-1로, 에러가 안 날 경우 4-2로!</h2>
<ul>
<li>
<p>4-1. 만약 pull하는데 pull/merge에서 conflict 오류 뜸 => 먼저 올린 사람과 같은 곳을 수정한 것. => 오류난 파일 열어서 다른사람이랑 코드 안겹치도록 수정(겹치는 곳은 파일에 아래 사진같은 표시 돼 있음) => 다시 git add . => git commit -m "본인 이름" => git pull => git push</p>
<img src="https://code.visualstudio.com/assets/docs/editor/versioncontrol/merge-conflict.png" />
<p><<<<<<<<<<와  >>>>>>>>>>>~~~~ 사이가 충돌난 부분. 여기서 필요없거나 겹치는 거 지우고 필요한 건 남긴 후 저장하면 됨</p>
<p>모르겠으면 https://www.youtube.com/embed/3D0zkEWGpZ4 참조</p>
</li>
<li><h3>4-2. 오류 안뜨면 그냥 바로 git push하면 됨</h3></li>
</ul>









<h1>처음 시작할 때</h1>
<h3> 1. git clone https://github.com/bebusl/PocketPolice.git</h3>
<h3> 2. 클론한 폴더 안드로이드 스튜디오로 오픈</h3>
<h3> 3. 페이지 수정<br></h3>
<img src="https://user-images.githubusercontent.com/49019236/80574272-80b15e80-8a3c-11ea-9f22-9d1c48f19328.png"> </img>
<br>
<p>지현<br>
Activity_signup.xml : 회원가입 화면<br>
Activity_login.xml:로그인 화면<br>
<br>
지애<br>
Activity_main.xml : 로딩<br>
Activity_home.xml : 홈<br>
Activity_configuration.xml : 환경설정 <br>
<br>
소영<br>
Activity_acting.xml : 기능 1,2 새 서비스 알람구현<br>
<br>
도희<br>
Activity_arriving.xml: 도착<br>
<br>
진희<br>
Activity_map_page.xml:지도<br>
<br>
수정하면됨</p> 
<h3> 4. 수정 완료시 git pull => git add . => git commit -m "수정한 내용 적기" => git push 해주면 깃에 올라온 소스랑 내가 수정한 소스랑 합쳐짐</h3>
