cmake_minimum_required(VERSION 3.10)
project(cmake_recipe)
add_executable(userprog userprog.c)
install (TARGETS userprog DESTINATION bin)
