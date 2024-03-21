class LetterModel {
  String title;
  String content;
  // String userId; // 사용자의 고유한 아이디, 이메일 혹은 전화번호로 사용자를 식별하는데 사용
  String uderId = '실험용 유저 아이디';
  DateTime date; // 작성일

  LetterModel({
    required this.title,
    required this.content,
    required this.date,
  });
  }
