// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HouseProto.proto

#include "HouseProto.pb.h"

#include <algorithm>

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/wire_format_lite.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>

PROTOBUF_PRAGMA_INIT_SEG
constexpr House::House(
  ::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized)
  : xiaoqu_(&::PROTOBUF_NAMESPACE_ID::internal::fixed_address_empty_string)
  , lou_(&::PROTOBUF_NAMESPACE_ID::internal::fixed_address_empty_string)
  , danyuan_(int64_t{0}){}
struct HouseDefaultTypeInternal {
  constexpr HouseDefaultTypeInternal()
    : _instance(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized{}) {}
  ~HouseDefaultTypeInternal() {}
  union {
    House _instance;
  };
};
PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT HouseDefaultTypeInternal _House_default_instance_;
static ::PROTOBUF_NAMESPACE_ID::Metadata file_level_metadata_HouseProto_2eproto[1];
static constexpr ::PROTOBUF_NAMESPACE_ID::EnumDescriptor const** file_level_enum_descriptors_HouseProto_2eproto = nullptr;
static constexpr ::PROTOBUF_NAMESPACE_ID::ServiceDescriptor const** file_level_service_descriptors_HouseProto_2eproto = nullptr;

const ::PROTOBUF_NAMESPACE_ID::uint32 TableStruct_HouseProto_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::House, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  PROTOBUF_FIELD_OFFSET(::House, xiaoqu_),
  PROTOBUF_FIELD_OFFSET(::House, lou_),
  PROTOBUF_FIELD_OFFSET(::House, danyuan_),
};
static const ::PROTOBUF_NAMESPACE_ID::internal::MigrationSchema schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  { 0, -1, sizeof(::House)},
};

static ::PROTOBUF_NAMESPACE_ID::Message const * const file_default_instances[] = {
  reinterpret_cast<const ::PROTOBUF_NAMESPACE_ID::Message*>(&::_House_default_instance_),
};

const char descriptor_table_protodef_HouseProto_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n\020HouseProto.proto\"5\n\005House\022\016\n\006xiaoqu\030\001 "
  "\001(\t\022\013\n\003lou\030\002 \001(\t\022\017\n\007danyuan\030\003 \001(\003B4\n(com"
  ".example.mq_protocol.dynamic_protocolB\010H"
  "ouseprob\006proto3"
  ;
static ::PROTOBUF_NAMESPACE_ID::internal::once_flag descriptor_table_HouseProto_2eproto_once;
const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable descriptor_table_HouseProto_2eproto = {
  false, false, 135, descriptor_table_protodef_HouseProto_2eproto, "HouseProto.proto", 
  &descriptor_table_HouseProto_2eproto_once, nullptr, 0, 1,
  schemas, file_default_instances, TableStruct_HouseProto_2eproto::offsets,
  file_level_metadata_HouseProto_2eproto, file_level_enum_descriptors_HouseProto_2eproto, file_level_service_descriptors_HouseProto_2eproto,
};
PROTOBUF_ATTRIBUTE_WEAK const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable* descriptor_table_HouseProto_2eproto_getter() {
  return &descriptor_table_HouseProto_2eproto;
}

// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY static ::PROTOBUF_NAMESPACE_ID::internal::AddDescriptorsRunner dynamic_init_dummy_HouseProto_2eproto(&descriptor_table_HouseProto_2eproto);

// ===================================================================

class House::_Internal {
 public:
};

House::House(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                         bool is_message_owned)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena, is_message_owned) {
  SharedCtor();
  if (!is_message_owned) {
    RegisterArenaDtor(arena);
  }
  // @@protoc_insertion_point(arena_constructor:House)
}
House::House(const House& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  xiaoqu_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_xiaoqu().empty()) {
    xiaoqu_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, from._internal_xiaoqu(), 
      GetArenaForAllocation());
  }
  lou_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_lou().empty()) {
    lou_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, from._internal_lou(), 
      GetArenaForAllocation());
  }
  danyuan_ = from.danyuan_;
  // @@protoc_insertion_point(copy_constructor:House)
}

inline void House::SharedCtor() {
xiaoqu_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
lou_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
danyuan_ = int64_t{0};
}

House::~House() {
  // @@protoc_insertion_point(destructor:House)
  if (GetArenaForAllocation() != nullptr) return;
  SharedDtor();
  _internal_metadata_.Delete<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

inline void House::SharedDtor() {
  GOOGLE_DCHECK(GetArenaForAllocation() == nullptr);
  xiaoqu_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  lou_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
}

void House::ArenaDtor(void* object) {
  House* _this = reinterpret_cast< House* >(object);
  (void)_this;
}
void House::RegisterArenaDtor(::PROTOBUF_NAMESPACE_ID::Arena*) {
}
void House::SetCachedSize(int size) const {
  _cached_size_.Set(size);
}

void House::Clear() {
// @@protoc_insertion_point(message_clear_start:House)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  xiaoqu_.ClearToEmpty();
  lou_.ClearToEmpty();
  danyuan_ = int64_t{0};
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* House::_InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  while (!ctx->Done(&ptr)) {
    ::PROTOBUF_NAMESPACE_ID::uint32 tag;
    ptr = ::PROTOBUF_NAMESPACE_ID::internal::ReadTag(ptr, &tag);
    switch (tag >> 3) {
      // string xiaoqu = 1;
      case 1:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 10)) {
          auto str = _internal_mutable_xiaoqu();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(::PROTOBUF_NAMESPACE_ID::internal::VerifyUTF8(str, "House.xiaoqu"));
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // string lou = 2;
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 18)) {
          auto str = _internal_mutable_lou();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(::PROTOBUF_NAMESPACE_ID::internal::VerifyUTF8(str, "House.lou"));
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // int64 danyuan = 3;
      case 3:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 24)) {
          danyuan_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      default: {
      handle_unusual:
        if ((tag == 0) || ((tag & 7) == 4)) {
          CHK_(ptr);
          ctx->SetLastTag(tag);
          goto success;
        }
        ptr = UnknownFieldParse(tag,
            _internal_metadata_.mutable_unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(),
            ptr, ctx);
        CHK_(ptr != nullptr);
        continue;
      }
    }  // switch
  }  // while
success:
  return ptr;
failure:
  ptr = nullptr;
  goto success;
#undef CHK_
}

::PROTOBUF_NAMESPACE_ID::uint8* House::_InternalSerialize(
    ::PROTOBUF_NAMESPACE_ID::uint8* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:House)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // string xiaoqu = 1;
  if (!this->_internal_xiaoqu().empty()) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_xiaoqu().data(), static_cast<int>(this->_internal_xiaoqu().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "House.xiaoqu");
    target = stream->WriteStringMaybeAliased(
        1, this->_internal_xiaoqu(), target);
  }

  // string lou = 2;
  if (!this->_internal_lou().empty()) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_lou().data(), static_cast<int>(this->_internal_lou().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "House.lou");
    target = stream->WriteStringMaybeAliased(
        2, this->_internal_lou(), target);
  }

  // int64 danyuan = 3;
  if (this->_internal_danyuan() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteInt64ToArray(3, this->_internal_danyuan(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:House)
  return target;
}

size_t House::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:House)
  size_t total_size = 0;

  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // string xiaoqu = 1;
  if (!this->_internal_xiaoqu().empty()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_xiaoqu());
  }

  // string lou = 2;
  if (!this->_internal_lou().empty()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_lou());
  }

  // int64 danyuan = 3;
  if (this->_internal_danyuan() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::Int64Size(
        this->_internal_danyuan());
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    return ::PROTOBUF_NAMESPACE_ID::internal::ComputeUnknownFieldsSize(
        _internal_metadata_, total_size, &_cached_size_);
  }
  int cached_size = ::PROTOBUF_NAMESPACE_ID::internal::ToCachedSize(total_size);
  SetCachedSize(cached_size);
  return total_size;
}

const ::PROTOBUF_NAMESPACE_ID::Message::ClassData House::_class_data_ = {
    ::PROTOBUF_NAMESPACE_ID::Message::CopyWithSizeCheck,
    House::MergeImpl
};
const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*House::GetClassData() const { return &_class_data_; }

void House::MergeImpl(::PROTOBUF_NAMESPACE_ID::Message*to,
                      const ::PROTOBUF_NAMESPACE_ID::Message&from) {
  static_cast<House *>(to)->MergeFrom(
      static_cast<const House &>(from));
}


void House::MergeFrom(const House& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:House)
  GOOGLE_DCHECK_NE(&from, this);
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  if (!from._internal_xiaoqu().empty()) {
    _internal_set_xiaoqu(from._internal_xiaoqu());
  }
  if (!from._internal_lou().empty()) {
    _internal_set_lou(from._internal_lou());
  }
  if (from._internal_danyuan() != 0) {
    _internal_set_danyuan(from._internal_danyuan());
  }
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
}

void House::CopyFrom(const House& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:House)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool House::IsInitialized() const {
  return true;
}

void House::InternalSwap(House* other) {
  using std::swap;
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::InternalSwap(
      &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(),
      &xiaoqu_, GetArenaForAllocation(),
      &other->xiaoqu_, other->GetArenaForAllocation()
  );
  ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::InternalSwap(
      &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(),
      &lou_, GetArenaForAllocation(),
      &other->lou_, other->GetArenaForAllocation()
  );
  swap(danyuan_, other->danyuan_);
}

::PROTOBUF_NAMESPACE_ID::Metadata House::GetMetadata() const {
  return ::PROTOBUF_NAMESPACE_ID::internal::AssignDescriptors(
      &descriptor_table_HouseProto_2eproto_getter, &descriptor_table_HouseProto_2eproto_once,
      file_level_metadata_HouseProto_2eproto[0]);
}

// @@protoc_insertion_point(namespace_scope)
PROTOBUF_NAMESPACE_OPEN
template<> PROTOBUF_NOINLINE ::House* Arena::CreateMaybeMessage< ::House >(Arena* arena) {
  return Arena::CreateMessageInternal< ::House >(arena);
}
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>
