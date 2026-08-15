cmake_minimum_required(VERSION 3.20)

project(
    leetcode_practice_c
    VERSION 0.1.0
    LANGUAGES C
)

set(CMAKE_C_STANDARD 17)
set(CMAKE_C_STANDARD_REQUIRED ON)
set(CMAKE_C_EXTENSIONS OFF)

enable_testing()

add_library(
    p0001_two_sum
    src/p0001/two_sum.c
)

target_include_directories(
    p0001_two_sum
    PUBLIC
        ${CMAKE_CURRENT_SOURCE_DIR}/include
)

target_compile_options(
    p0001_two_sum
    PRIVATE
        -Wall
        -Wextra
        -Wpedantic
)

add_executable(
    test_p0001_two_sum
    tests/p0001/test_two_sum.c
)

target_link_libraries(
    test_p0001_two_sum
    PRIVATE
        p0001_two_sum
)

add_test(
    NAME p0001_two_sum
    COMMAND test_p0001_two_sum
)