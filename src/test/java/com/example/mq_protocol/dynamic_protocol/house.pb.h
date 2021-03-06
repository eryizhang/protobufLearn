// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: house.proto

#ifndef GOOGLE_PROTOBUF_INCLUDED_house_2eproto
#define GOOGLE_PROTOBUF_INCLUDED_house_2eproto

#include <limits>
#include <string>

#include <google/protobuf/port_def.inc>
#if PROTOBUF_VERSION < 3017000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers. Please update
#error your headers.
#endif
#if 3017003 < PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers. Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/port_undef.inc>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_table_driven.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/metadata_lite.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>  // IWYU pragma: export
#include <google/protobuf/extension_set.h>  // IWYU pragma: export
#include <google/protobuf/unknown_field_set.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>
#define PROTOBUF_INTERNAL_EXPORT_house_2eproto
PROTOBUF_NAMESPACE_OPEN
namespace internal {
class AnyMetadata;
}  // namespace internal
PROTOBUF_NAMESPACE_CLOSE

// Internal implementation detail -- do not use these members.
struct TableStruct_house_2eproto {
  static const ::PROTOBUF_NAMESPACE_ID::internal::ParseTableField entries[]
    PROTOBUF_SECTION_VARIABLE(protodesc_cold);
  static const ::PROTOBUF_NAMESPACE_ID::internal::AuxiliaryParseTableField aux[]
    PROTOBUF_SECTION_VARIABLE(protodesc_cold);
  static const ::PROTOBUF_NAMESPACE_ID::internal::ParseTable schema[1]
    PROTOBUF_SECTION_VARIABLE(protodesc_cold);
  static const ::PROTOBUF_NAMESPACE_ID::internal::FieldMetadata field_metadata[];
  static const ::PROTOBUF_NAMESPACE_ID::internal::SerializationTable serialization_table[];
  static const ::PROTOBUF_NAMESPACE_ID::uint32 offsets[];
};
extern const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable descriptor_table_house_2eproto;
class House;
struct HouseDefaultTypeInternal;
extern HouseDefaultTypeInternal _House_default_instance_;
PROTOBUF_NAMESPACE_OPEN
template<> ::House* Arena::CreateMaybeMessage<::House>(Arena*);
PROTOBUF_NAMESPACE_CLOSE

// ===================================================================

class House final :
    public ::PROTOBUF_NAMESPACE_ID::Message /* @@protoc_insertion_point(class_definition:House) */ {
 public:
  inline House() : House(nullptr) {}
  ~House() override;
  explicit constexpr House(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized);

  House(const House& from);
  House(House&& from) noexcept
    : House() {
    *this = ::std::move(from);
  }

  inline House& operator=(const House& from) {
    CopyFrom(from);
    return *this;
  }
  inline House& operator=(House&& from) noexcept {
    if (this == &from) return *this;
    if (GetOwningArena() == from.GetOwningArena()) {
      InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }

  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* descriptor() {
    return GetDescriptor();
  }
  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* GetDescriptor() {
    return default_instance().GetMetadata().descriptor;
  }
  static const ::PROTOBUF_NAMESPACE_ID::Reflection* GetReflection() {
    return default_instance().GetMetadata().reflection;
  }
  static const House& default_instance() {
    return *internal_default_instance();
  }
  static inline const House* internal_default_instance() {
    return reinterpret_cast<const House*>(
               &_House_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    0;

  friend void swap(House& a, House& b) {
    a.Swap(&b);
  }
  inline void Swap(House* other) {
    if (other == this) return;
    if (GetOwningArena() == other->GetOwningArena()) {
      InternalSwap(other);
    } else {
      ::PROTOBUF_NAMESPACE_ID::internal::GenericSwap(this, other);
    }
  }
  void UnsafeArenaSwap(House* other) {
    if (other == this) return;
    GOOGLE_DCHECK(GetOwningArena() == other->GetOwningArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  inline House* New() const final {
    return new House();
  }

  House* New(::PROTOBUF_NAMESPACE_ID::Arena* arena) const final {
    return CreateMaybeMessage<House>(arena);
  }
  using ::PROTOBUF_NAMESPACE_ID::Message::CopyFrom;
  void CopyFrom(const House& from);
  using ::PROTOBUF_NAMESPACE_ID::Message::MergeFrom;
  void MergeFrom(const House& from);
  private:
  static void MergeImpl(::PROTOBUF_NAMESPACE_ID::Message*to, const ::PROTOBUF_NAMESPACE_ID::Message&from);
  public:
  PROTOBUF_ATTRIBUTE_REINITIALIZES void Clear() final;
  bool IsInitialized() const final;

  size_t ByteSizeLong() const final;
  const char* _InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) final;
  ::PROTOBUF_NAMESPACE_ID::uint8* _InternalSerialize(
      ::PROTOBUF_NAMESPACE_ID::uint8* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const final;
  int GetCachedSize() const final { return _cached_size_.Get(); }

  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const final;
  void InternalSwap(House* other);
  friend class ::PROTOBUF_NAMESPACE_ID::internal::AnyMetadata;
  static ::PROTOBUF_NAMESPACE_ID::StringPiece FullMessageName() {
    return "House";
  }
  protected:
  explicit House(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                       bool is_message_owned = false);
  private:
  static void ArenaDtor(void* object);
  inline void RegisterArenaDtor(::PROTOBUF_NAMESPACE_ID::Arena* arena);
  public:

  static const ClassData _class_data_;
  const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*GetClassData() const final;

  ::PROTOBUF_NAMESPACE_ID::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  enum : int {
    kXiaoquFieldNumber = 1,
    kLouFieldNumber = 2,
    kDanyuanFieldNumber = 3,
  };
  // string xiaoqu = 1;
  void clear_xiaoqu();
  const std::string& xiaoqu() const;
  template <typename ArgT0 = const std::string&, typename... ArgT>
  void set_xiaoqu(ArgT0&& arg0, ArgT... args);
  std::string* mutable_xiaoqu();
  PROTOBUF_MUST_USE_RESULT std::string* release_xiaoqu();
  void set_allocated_xiaoqu(std::string* xiaoqu);
  private:
  const std::string& _internal_xiaoqu() const;
  inline PROTOBUF_ALWAYS_INLINE void _internal_set_xiaoqu(const std::string& value);
  std::string* _internal_mutable_xiaoqu();
  public:

  // string lou = 2;
  void clear_lou();
  const std::string& lou() const;
  template <typename ArgT0 = const std::string&, typename... ArgT>
  void set_lou(ArgT0&& arg0, ArgT... args);
  std::string* mutable_lou();
  PROTOBUF_MUST_USE_RESULT std::string* release_lou();
  void set_allocated_lou(std::string* lou);
  private:
  const std::string& _internal_lou() const;
  inline PROTOBUF_ALWAYS_INLINE void _internal_set_lou(const std::string& value);
  std::string* _internal_mutable_lou();
  public:

  // int64 danyuan = 3;
  void clear_danyuan();
  ::PROTOBUF_NAMESPACE_ID::int64 danyuan() const;
  void set_danyuan(::PROTOBUF_NAMESPACE_ID::int64 value);
  private:
  ::PROTOBUF_NAMESPACE_ID::int64 _internal_danyuan() const;
  void _internal_set_danyuan(::PROTOBUF_NAMESPACE_ID::int64 value);
  public:

  // @@protoc_insertion_point(class_scope:House)
 private:
  class _Internal;

  template <typename T> friend class ::PROTOBUF_NAMESPACE_ID::Arena::InternalHelper;
  typedef void InternalArenaConstructable_;
  typedef void DestructorSkippable_;
  ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr xiaoqu_;
  ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr lou_;
  ::PROTOBUF_NAMESPACE_ID::int64 danyuan_;
  mutable ::PROTOBUF_NAMESPACE_ID::internal::CachedSize _cached_size_;
  friend struct ::TableStruct_house_2eproto;
};
// ===================================================================


// ===================================================================

#ifdef __GNUC__
  #pragma GCC diagnostic push
  #pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// House

// string xiaoqu = 1;
inline void House::clear_xiaoqu() {
  xiaoqu_.ClearToEmpty();
}
inline const std::string& House::xiaoqu() const {
  // @@protoc_insertion_point(field_get:House.xiaoqu)
  return _internal_xiaoqu();
}
template <typename ArgT0, typename... ArgT>
inline PROTOBUF_ALWAYS_INLINE
void House::set_xiaoqu(ArgT0&& arg0, ArgT... args) {
 
 xiaoqu_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, static_cast<ArgT0 &&>(arg0), args..., GetArenaForAllocation());
  // @@protoc_insertion_point(field_set:House.xiaoqu)
}
inline std::string* House::mutable_xiaoqu() {
  std::string* _s = _internal_mutable_xiaoqu();
  // @@protoc_insertion_point(field_mutable:House.xiaoqu)
  return _s;
}
inline const std::string& House::_internal_xiaoqu() const {
  return xiaoqu_.Get();
}
inline void House::_internal_set_xiaoqu(const std::string& value) {
  
  xiaoqu_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, value, GetArenaForAllocation());
}
inline std::string* House::_internal_mutable_xiaoqu() {
  
  return xiaoqu_.Mutable(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, GetArenaForAllocation());
}
inline std::string* House::release_xiaoqu() {
  // @@protoc_insertion_point(field_release:House.xiaoqu)
  return xiaoqu_.Release(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), GetArenaForAllocation());
}
inline void House::set_allocated_xiaoqu(std::string* xiaoqu) {
  if (xiaoqu != nullptr) {
    
  } else {
    
  }
  xiaoqu_.SetAllocated(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), xiaoqu,
      GetArenaForAllocation());
  // @@protoc_insertion_point(field_set_allocated:House.xiaoqu)
}

// string lou = 2;
inline void House::clear_lou() {
  lou_.ClearToEmpty();
}
inline const std::string& House::lou() const {
  // @@protoc_insertion_point(field_get:House.lou)
  return _internal_lou();
}
template <typename ArgT0, typename... ArgT>
inline PROTOBUF_ALWAYS_INLINE
void House::set_lou(ArgT0&& arg0, ArgT... args) {
 
 lou_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, static_cast<ArgT0 &&>(arg0), args..., GetArenaForAllocation());
  // @@protoc_insertion_point(field_set:House.lou)
}
inline std::string* House::mutable_lou() {
  std::string* _s = _internal_mutable_lou();
  // @@protoc_insertion_point(field_mutable:House.lou)
  return _s;
}
inline const std::string& House::_internal_lou() const {
  return lou_.Get();
}
inline void House::_internal_set_lou(const std::string& value) {
  
  lou_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, value, GetArenaForAllocation());
}
inline std::string* House::_internal_mutable_lou() {
  
  return lou_.Mutable(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, GetArenaForAllocation());
}
inline std::string* House::release_lou() {
  // @@protoc_insertion_point(field_release:House.lou)
  return lou_.Release(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), GetArenaForAllocation());
}
inline void House::set_allocated_lou(std::string* lou) {
  if (lou != nullptr) {
    
  } else {
    
  }
  lou_.SetAllocated(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), lou,
      GetArenaForAllocation());
  // @@protoc_insertion_point(field_set_allocated:House.lou)
}

// int64 danyuan = 3;
inline void House::clear_danyuan() {
  danyuan_ = int64_t{0};
}
inline ::PROTOBUF_NAMESPACE_ID::int64 House::_internal_danyuan() const {
  return danyuan_;
}
inline ::PROTOBUF_NAMESPACE_ID::int64 House::danyuan() const {
  // @@protoc_insertion_point(field_get:House.danyuan)
  return _internal_danyuan();
}
inline void House::_internal_set_danyuan(::PROTOBUF_NAMESPACE_ID::int64 value) {
  
  danyuan_ = value;
}
inline void House::set_danyuan(::PROTOBUF_NAMESPACE_ID::int64 value) {
  _internal_set_danyuan(value);
  // @@protoc_insertion_point(field_set:House.danyuan)
}

#ifdef __GNUC__
  #pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)


// @@protoc_insertion_point(global_scope)

#include <google/protobuf/port_undef.inc>
#endif  // GOOGLE_PROTOBUF_INCLUDED_GOOGLE_PROTOBUF_INCLUDED_house_2eproto
