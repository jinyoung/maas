<template>

    <v-card outlined>
        <v-card-title>
            UpdateVoicePrompt
        </v-card-title>

        <v-card-text>
            <String label="Message" v-model="value.message" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updateVoicePrompt"
            >
                UpdateVoicePrompt
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateVoicePromptCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.voicePromptId = {};
            this.value.message = '';
        },
        watch: {
        },
        methods: {
            updateVoicePrompt() {
                this.$emit('updateVoicePrompt', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

