- DTO (Data Transfer Object): Là thư mục chứa các Object lấy trực tiếp từ api.
    Tức là json trả về gồm những trường nào thì trong model sẽ chứa tất cả các trường đó
- Khi hiển thị lên UI, đôi khi chúng ta không cần hết tất cả các trường trong 1 object ở DTO. Vì vậy, chúng ta sẽ tạo model ở trong
domain. Model này sẽ chứa những trường mà chúng ta cần để sử dụng, được chọn lọc từ DTO
- Repository trong domain layer: chứa các interface của repository. Trong mỗi repo sẽ chứa các method để tương tác với remote hoặc
local database
- Repository trong data layer sẽ chứa các implement của các interface có trong repo ở domain layer
- Trong mỗi use case, chúng ta sẽ override the invoke operator function. Một use case chỉ nên có một public function, và đó là hàm
để thực thi usecase đó (trong project này là get coins)
- Hầu hết các business logic đã được di chuyển từ ViewModel xuống Usecase. Vì vậy, mục đích chính của ViewModel bây giờ là duy
trì state khi thay đổi trạng thái của màn hình (ví dụ như xoay ngang/dọc màn hình), thay đổi ngôn ngữ,... Tất nhiên, trong viewmodel
vẫn sẽ còn business logic, nhưng sẽ ít hơn so với mô hình MVVM thuần.