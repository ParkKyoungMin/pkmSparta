# Kiosk Java

이 프로젝트는 간단한 메뉴 기반의 주문 시스템을 구현한 것입니다. 사용자는 메뉴에서 음식을 선택하고, 선택한 음식을 확인할 수 있습니다.

## 프로젝트 구조

프로젝트 디렉토리 `calculator_java/src/main/java/com/example` 아래에 다음과 같은 디렉토리가 있습니다:

- **KioskLv1**: 기본적인 메뉴 선택 기능을 제공하는 첫 번째 버전입니다.
- **KioskLv2**: 메뉴 항목을 객체로 관리하고 사용자에게 메뉴를 보여주는 두 번째 버전입니다.
- **KioskLv3**: 메뉴 항목을 객체로 관리하고 사용자에게 메뉴를 보여주는 세 번째 버전입니다.
- **KioskLv4**: 메뉴 항목을 객체로 관리하고 사용자에게 메뉴를 보여주는 세 번째 버전입니다.
- **KioskLv5**: 메뉴 항목을 객체로 관리하고 사용자에게 메뉴를 보여주는 세 번째 버전입니다.
- **KioskLv6**: 메뉴 항목을 객체로 관리하고 사용자에게 메뉴를 보여주는 세 번째 버전입니다.
- **KioskLv7**: 메뉴 항목을 객체로 관리하고 사용자에게 메뉴를 보여주는 세 번째 버전입니다.

---

## KioskLv1 > Main.java

이 파일은 사용자에게 메뉴를 제공하고 선택된 메뉴에 따라 적절한 메시지를 출력하는 기본적인 기능을 구현합니다.

### 주요 기능

- **메뉴 출력**: 사용자가 선택할 수 있는 메뉴 항목을 출력합니다.
- **사용자 입력 처리**: 사용자가 선택한 메뉴 번호를 입력받고, 이에 따라 적절한 동작을 수행합니다.
- **예외 처리**: 잘못된 메뉴 선택에 대해 적절한 오류 메시지를 출력합니다.

### 사용 방법

1. **프로그램 실행**: `Main` 클래스를 실행하여 Kiosk 프로그램을 시작합니다.
2. **메뉴 선택**: 
   - 사용자는 제공된 메뉴 목록에서 원하는 항목의 번호를 입력합니다.
3. **결과 확인**: 선택한 메뉴에 대한 메시지가 출력되며, 프로그램은 계속해서 메뉴를 보여줍니다. "0"을 입력하면 프로그램이 종료됩니다.

### 예제

```
[ SHAKESHACK MENU ]
ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
SmokeShack   | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
종료 | 종료 메뉴를 선택하세요:
```
**입력:**
```
1
```
**출력:**
```
ShackBurger를 선택하셨습니다.
```
**입력:**
```
0
```
**출력:**
```
프로그램을 종료합니다.
```
---

---

## KioskLv2 > Main.java
## KioskLv2 > MenuItem.java

이 파일은 사용자에게 메뉴를 제공하고 선택된 메뉴에 따라 적절한 메시지를 출력하는 기능을 구현합니다. 메뉴 항목은 `MenuItem` 클래스를 통해 관리됩니다.

### 주요 기능

- **메뉴 출력**: 사용자가 선택할 수 있는 메뉴 항목을 출력합니다.
- **사용자 입력 처리**: 사용자가 선택한 메뉴 번호를 입력받고, 이에 따라 적절한 동작을 수행합니다.
- **예외 처리**: 잘못된 메뉴 선택에 대해 적절한 오류 메시지를 출력합니다.

### 사용 방법

1. **프로그램 실행**: `Main` 클래스를 실행하여 Kiosk 프로그램을 시작합니다.
2. **메뉴 선택**: 
   - 사용자는 제공된 메뉴 목록에서 원하는 항목의 번호를 입력합니다.
3. **결과 확인**: 선택한 메뉴에 대한 정보가 출력되며, 프로그램은 계속해서 메뉴를 보여줍니다. "0"을 입력하면 프로그램이 종료됩니다.

### 예제
```
[ SHAKESHACK MENU ]
ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
SmokeShack   | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
종료 | 종료 메뉴를 선택하세요:
```
**입력:**
```
1
```
**출력:**
```
선택한 메뉴: ShackBurger, 가격: W 6.90, 설명: 토마토, 양상추, 쉑소스가 토핑된 치즈버거
```
**입력:**
```
0
```
**출력:**
```
프로그램을 종료합니다.
```
---

---

## KioskLv3 > Main.java
## KioskLv3 > Kiosk.java
## KioskLv3 > MenuItem.java


## KioskLv3 > Kiosk.java

이 파일은 사용자에게 메뉴를 제공하고 선택된 메뉴에 따라 적절한 메시지를 출력하는 기능을 구현합니다. 메뉴 항목은 `MenuItem` 클래스를 통해 관리됩니다.
기본적인 기능은 `Kiosk` 클래스를 통해 관리합니다.

### 주요 기능

- **메뉴 출력**: 사용자가 선택할 수 있는 메뉴 항목을 출력합니다.
- **사용자 입력 처리**: 사용자가 선택한 메뉴 번호를 입력받고, 이에 따라 적절한 동작을 수행합니다.
- **예외 처리**: 잘못된 메뉴 선택에 대해 적절한 오류 메시지를 출력합니다.

### 사용 방법

1. **프로그램 실행**: `Main` 클래스를 실행하여 Kiosk 프로그램을 시작합니다.
2. **메뉴 선택**: 
   - 사용자는 제공된 메뉴 목록에서 원하는 항목의 번호를 입력합니다.
3. **결과 확인**: 선택한 메뉴에 대한 정보가 출력되며, 프로그램은 계속해서 메뉴를 보여줍니다. "0"을 입력하면 프로그램이 종료됩니다.


### 예제
```
[ SHAKESHACK MENU ]
ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
SmokeShack   | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
종료 | 종료 메뉴를 선택하세요:
```
**입력:**
```
1
```
**출력:**
```
선택한 메뉴: ShackBurger, 가격: W 6.90, 설명: 토마토, 양상추, 쉑소스가 토핑된 치즈버거
```
**입력:**
```
0
```
**출력:**
```
프로그램을 종료합니다.
```
---

---

## KioskLv4

이 프로젝트는 간단한 메뉴 기반의 주문 시스템을 구현한 것입니다. 사용자는 메뉴에서 음식을 선택하고, 선택한 음식을 확인할 수 있습니다. 이 버전에서는 메뉴 항목을 카테고리별로 관리할 수 있도록 구조를 개선하였습니다.

## 프로젝트 구조

프로젝트 디렉토리 `calculator_java/src/main/java/com/example` 아래에 다음과 같은 디렉토리가 있습니다:

- **KioskLv4**: 메뉴 항목을 카테고리별로 관리하고 사용자에게 메뉴를 보여주는 네 번째 버전입니다.
  - **Menu**: 메뉴 항목과 관련된 클래스를 포함합니다.
    - `Menu.java`: 메뉴 카테고리와 메뉴 항목을 관리하는 클래스입니다.
    - `MenuItem.java`: 개별 메뉴 항목을 정의하는 클래스입니다.
  - `Kiosk.java`: 사용자에게 메뉴를 제공하고 선택된 메뉴에 따라 적절한 메시지를 출력하는 기능을 구현합니다.
  - `Main.java`: 프로그램의 시작점을 정의하고 메뉴를 초기화합니다.

---

### 주요 기능

- **메인 메뉴 출력**: 여러 카테고리의 메뉴를 사용자에게 보여줍니다.
- **사용자 입력 처리**: 사용자가 선택한 메뉴 번호를 입력받고, 이에 따라 적절한 동작을 수행합니다.
- **서브 메뉴 출력**: 선택된 카테고리의 메뉴 항목을 보여줍니다.
- **예외 처리**: 잘못된 메뉴 선택에 대해 적절한 오류 메시지를 출력합니다.

### 사용 방법

1. **프로그램 실행**: `Main` 클래스를 실행하여 Kiosk 프로그램을 시작합니다.
2. **메뉴 선택**: 
   - 사용자는 제공된 메뉴 목록에서 원하는 카테고리의 번호를 입력합니다.
3. **결과 확인**: 선택한 카테고리에 대한 메뉴 항목이 출력되며, 사용자는 원하는 메뉴 항목의 번호를 입력할 수 있습니다.
4. **메뉴 항목 확인**: 선택한 메뉴 항목에 대한 정보가 출력됩니다. "0"을 입력하면 프로그램이 종료됩니다.

### 예제

```
[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료 | 종료
```
**입력**
```
1
```
**출력**
```
[ Burgers MENU ]
1. ShackBurger | W 6.90 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack | W 8.90 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger| W 6.90 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger | W 5.40 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기
```

**입력**
```
1
```
**출력**
```
선택한 메뉴: ShackBurger | W 6.90 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료 | 종료
```

---

---

# KioskLv5

## 프로젝트 구조

프로젝트 디렉토리 `calculator_java/src/main/java/com/example` 아래에 다음과 같은 디렉토리가 있습니다:

- **KioskLv5**: 메뉴 항목을 카테고리별로 관리하고 사용자에게 메뉴를 보여주는 다섯 번째 버전입니다.
  - **Menu**: 메뉴 항목과 관련된 클래스를 포함합니다.
    - `Menu.java`: 메뉴 카테고리와 메뉴 항목을 관리하는 클래스입니다.
    - `MenuItem.java`: 개별 메뉴 항목을 정의하는 클래스입니다.
  - `Kiosk.java`: 사용자에게 메뉴를 제공하고 선택된 메뉴에 따라 적절한 메시지를 출력하는 기능을 구현합니다.
  - `Main.java`: 프로그램의 시작점을 정의하고 메뉴를 초기화합니다.

---

## KioskLv5 > Kiosk.java

이 파일은 사용자에게 메뉴를 제공하고 선택된 메뉴에 따라 적절한 메시지를 출력하는 기능을 구현합니다. 관리 모드에서는 메뉴 항목을 수정할 수 있는 기능을 포함합니다.

### 주요 기능

- **메인 메뉴 출력**: 여러 카테고리의 메뉴를 사용자에게 보여줍니다.
- **사용자 입력 처리**: 사용자가 선택한 메뉴 번호를 입력받고, 이에 따라 적절한 동작을 수행합니다.
- **서브 메뉴 출력**: 선택된 카테고리의 메뉴 항목을 보여줍니다.
- **관리 기능**: 비밀번호 인증 후 메뉴 항목의 이름, 가격, 설명을 수정할 수 있습니다.

### 사용 방법

1. **프로그램 실행**: `Main` 클래스를 실행하여 Kiosk 프로그램을 시작합니다.
2. **메뉴 선택**: 
   - 사용자는 제공된 메뉴 목록에서 원하는 카테고리의 번호를 입력합니다.
3. **결과 확인**: 선택한 카테고리에 대한 메뉴 항목이 출력되며, 사용자는 원하는 메뉴 항목의 번호를 입력할 수 있습니다.
4. **메뉴 항목 확인**: 선택한 메뉴 항목에 대한 정보가 출력됩니다. "0"을 입력하면 프로그램이 종료됩니다.
5. **관리 모드**: "4. 관리하기"를 선택하여 비밀번호를 입력하면 메뉴 항목을 수정할 수 있는 관리 모드에 들어갑니다.

### 예제

```
[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
4. 관리하기
0. 종료 | 종료
```
**입력**
```
4
```
**출력**
```
비밀번호를 입력하세요 :
```

**입력**
```
1234
```
**출력**
```
수정할 메뉴의 카테고리를 선택하세요:
1. Burgers
2. Drinks
3. Desserts
```

**입력**
```
1
```
**출력**
```
메뉴 이름                     가격         설명
--------------------------------------------------
1. ShackBurger               W 6.90     토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack                W 8.90     베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger              W 6.90     포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger                 W 5.40     비프패티를 기반으로 야채가 들어간 기본버거
수정할 메뉴 항목의 번호를 입력하세요: 
```

**입력**
```
1
```
**출력**
```
새로운 이름을 입력하세요 (현재: ShackBurger): 
```

**입력**
```
MomsBurger
```
**출력**
```
새로운 가격을 입력하세요 (현재: 6.9): 
```

**입력**
```
4.1
```
**출력**
```
새로운 설명을 입력하세요 (현재: 토마토, 양상추, 쉑소스가 토핑된 치즈버거):
```

**입력**
```
엄마 손맛 버거
```
**출력**
```
메뉴 항목이 수정되었습니다.

[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
4. 관리하기
0. 종료 | 종료
메뉴를 선택하세요: 
```

**입력**
```
1
```
**출력**
```
[ Burgers MENU ]
메뉴 이름                     가격         설명
--------------------------------------------------
1. MomsBurger                W 4.10     엄마손맛버거
2. SmokeShack                W 8.90     베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger              W 6.90     포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger                 W 5.40     비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기
```


