package com.adhd.fodong.domain.friend.repository;

import com.adhd.fodong.domain.friend.entity.Friendship;
import com.adhd.fodong.domain.user.profile.entity.ProfileEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface FriendRepository {

    void sendFriendRequest(Friendship friendship);

    Integer findFriendshipIdByFromIdWithToId(Friendship friendship);

    Integer ReverseFindFriendshipIdByFromIdWithToId(Friendship friendship);

    void updateStatus(Friendship friendship);

    List<ProfileEntity> getFriendsByProfileId(int profileId);
}