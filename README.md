- Domain driven design: là thiết kế hệ thống theo hướng business logic.

- Thiết kế gồm 3 phần chính:
    + Application layer: người dùng tương tác với hệ thống thông qua phần này. Vì vậy, chúng ta có thể để một số phần như RESTfull Controller, interfaces,.... Nó bao gồm những thứ về quyền truy cập vào hệ thống(api), và điều phối thực hiện các business logic trong domain
    + Domain layer: là phần gồm các xử lý business logic của hệ thống. Đây là phần lõi của hệ thống. Phần này chứa các phần như entity và repository giao tiếp và lấy dữ liệu từ database.
    + Infrastructure: là phần cơ sở hạ tầng của hệ thống. Đây là phần chưa các cấu hình của hệ thống, ví dụ như: cấu hình database, kafka, cache,.....
    + User interface: Chịu trách nhiệm trình bày thông tin tới người sử dụng và thông dịch lệnh của người dùng.

- Entity: package này lưu các đối tượng entity mapping database
- Value object: value object là bất biến, chúng ta không thể sửa dổi trực tiếp thuộc tính của nó. Package này lưu các đối tượng custom từ entity. Ví dụ: từ entity customer và 
- Aggregate: package này lưu các đối tượng kết hợp từ entity là gốc và các đối tượng khác. Mọi yêu cầu gọi từ bên ngoài đều phải thông qua aggregate root, không có gì bên ngoài có thể tham chiếu đến các thực thể khác trong tổng thể. Tổng hợp xác định ranh giới nhất quán trong đó trạng thái của tất cả các thực thể phải hợp lệ theo quy tắc của business.
- Domain event: khi thao tác vào thông qua aggregate đều bắn event để thực hiện các thao tác còn lại.
- Factory: package chứa các method để mapping khi tạo dữ liệu giúp cho entity gốc đạt được tính toàn vẹn dữ liệu, ví dụ: khi tạo đơn hàng(Order) thì cần phải có thông tin chi tiết(detail) và thông tin sản phẩm(product) thông tin thanh toán(payment) vì vậy ta cần viết hàm để khởi tạo một object để đạt tính toàn vẹn dữ liệu

Luồng Client -> gọi tới hàm createOrder("123") của Factory và trả về một đơn hàng Order("123) -> sau đó client gọi tới lớp repository để lưu vào database